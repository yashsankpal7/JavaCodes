package ass_class_2;

import java.util.HashMap;
import java.util.Map;

public class _43 {
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
        Map<Integer,Insurance> map = new HashMap<Integer,Insurance>();

        map.put(0,new Insurance(121,123456,1234,"Yash","Aishwarya","Monthly"));
        map.put(map.size(),new Insurance(122,12346,124,"Sandeep","Akansha","Periodic"));
        map.put(map.size(),new Insurance(123,12345,213,"Bhaskar","Rohan","Monthly"));
        map.put(map.size(),new Insurance(124,12346,155,"Mayur","Bhaskar","Yearly"));
        map.put(map.size(),new Insurance(125,12347,188,"Rohan","Mayur","Monthly"));


        System.out.println("HashMap size "+map.size());
        System.out.println("Checking if contains 199 as a key "+map.containsKey(3));
        System.out.println("Getting value at key 1 "+map.get(1));
        System.out.println("Collections of values of keys "+map.values());
        System.out.println("Removing value having key 4 "+map.remove(4));
        System.out.println("Replacing value at key 1 with value at key 2 "+map.replace(1,map.get(2)));
        System.out.println("Checking if contains value: "+map.containsValue(map.get(4)));
        System.out.println("Is hashmap empty? "+map.isEmpty());
    }
}
