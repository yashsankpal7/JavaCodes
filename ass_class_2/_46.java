package ass_class_2;

import classWork.Comparable_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _46 {
    static class Insurance implements Comparable{
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

        @Override
        public int compareTo(Object o) {
            Insurance ins = (Insurance) o;

            return this.name.compareTo(ins.name);
        }
    }

    public static void main(String[] args){
        List<Insurance> lis = new ArrayList<Insurance>();

        lis.add(new Insurance(121,123456,1234,"Yash","Aishwarya","Monthly"));
        lis.add(new Insurance(122,12346,124,"Sandeep","Akansha","Periodic"));
        lis.add(new Insurance(123,12345,213,"Bhaskar","Rohan","Monthly"));
        lis.add(new Insurance(124,12346,155,"Mayur","Bhaskar","Yearly"));
        lis.add(new Insurance(125,12347,188,"Rohan","Mayur","Monthly"));

        for(Insurance mvObj: lis){
            System.out.println(mvObj.name);
        }

        System.out.println();
        Collections.sort(lis);

        for(Insurance mvObj: lis){
            System.out.println(mvObj.name);
        }
    }
}
