package ass_class_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _44 {
    static class Insurance{
        int policyNum;
        int insuranceAmt;
        String nominee;
        String name;
        int installment;
        String typeOfInstallment;

        Insurance(int policyNum,int insuranceAmt,int installment,String name,String nominee,String typeOfInstallment){
            this.installment=installment;
            this.policyNum=policyNum;
            this.insuranceAmt=insuranceAmt;
            this.nominee=nominee;
            this.typeOfInstallment=typeOfInstallment;
            this.name=name;
        }

        public int hashCode(){
            int hashCode=policyNum+name.hashCode();
            return hashCode;
        }

        public boolean equals(Object o){
            _42.Insurance ins = (_42.Insurance) o;

            if(policyNum==ins.policyNum && name.equals(ins.name)) return true;
            else return false;
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "policyNum=" + policyNum +
                    ", insuranceAmt=" + insuranceAmt +
                    ", nominee='" + nominee + '\'' +
                    ", name='" + name + '\'' +
                    ", installment=" + installment +
                    ", typeOfInstallment='" + typeOfInstallment + '\'' +
                    '}';
        }
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int ch;
        boolean cont = true;

        Map<Integer, Insurance> map = new HashMap<Integer, Insurance>();

        map.put(0,new Insurance(121,123456,1234,"Yash","Aishwarya","Monthly"));
        map.put(map.size(),new Insurance(122,12346,124,"Sandeep","Akansha","Periodic"));
        map.put(map.size(),new Insurance(123,12345,213,"Bhaskar","Rohan","Monthly"));
        map.put(map.size(),new Insurance(124,12346,155,"Mayur","Bhaskar","Yearly"));
        map.put(map.size(),new Insurance(125,12347,188,"Rohan","Mayur","Monthly"));

        int policyNum;
        int insuranceAmt;
        String nominee;
        String name;
        int installment;
        String typeOfInstallment;
        Insurance tmp;

        while(cont) {
            System.out.println("choice 1 Insert \nchoice 2 display \nchoice 3 display by choice \nchoice 4 Update \n choice 5 delete \nchoice 6 terminate\nchoose any one: ");
            ch=sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.println("Enter policy num | insurance amt | nominee name | your name | installment amt | type of installment.: ");
                    policyNum = sc.nextInt();
                    insuranceAmt = sc.nextInt();
                    nominee = sc.next();
                    name = sc.next();
                    installment = sc.nextInt();
                    typeOfInstallment = sc.next();
                    map.put(map.size(),new Insurance(policyNum,insuranceAmt,installment,name,nominee,typeOfInstallment));
                    break;
                case 2:
                    for(Map.Entry<Integer,Insurance> i:map.entrySet()){
                        System.out.println(i.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Enter key value.: ");
                    policyNum = sc.nextInt();
                    if(policyNum > map.size()) System.out.println("Not there!!");
                    else{
                        System.out.println(map.get(policyNum));
                    }
                    break;
                case 4:
                    System.out.println("Enter key value.: ");
                    policyNum = sc.nextInt();
                    if(policyNum > map.size()) System.out.println("Not there!!");
                    else{
                        System.out.println("Enter insurance amt | nominee name | installment amt | type of installment.: ");
                        insuranceAmt = sc.nextInt();
                        nominee = sc.next();
                        installment = sc.nextInt();
                        typeOfInstallment = sc.next();

                        if(insuranceAmt > 0) map.get(policyNum).insuranceAmt = insuranceAmt;
                        if(!nominee.equalsIgnoreCase("null")) map.get(policyNum).nominee = nominee;
                        if(installment > 0) map.get(policyNum).installment = installment;
                        if(Arrays.asList(new String[]{"Monthly", "Yearly", "Quaterly"}).contains(typeOfInstallment)) map.get(policyNum).typeOfInstallment = typeOfInstallment;
                    }
                    break;
                case 5:
                    System.out.println("Enter key value.: ");
                    policyNum = sc.nextInt();
                    if(policyNum > map.size()) System.out.println("Not there!!");
                    else{
                        map.remove(policyNum);
                    }
                    break;
                case 6:
                    cont=false;
                    break;
                default:
                    System.out.println("Select between 1 to 4....");
            }

            System.out.println("Thanks");
        }
    }
}
