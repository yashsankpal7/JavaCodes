package ass_class_2;

import java.util.HashSet;
import java.util.Set;

public class _42 {
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
            Insurance ins = (Insurance) o;

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
        Set<Insurance> set = new HashSet<Insurance>();

        set.add(new Insurance(121,123456,1234,"Yash","Aishwarya","Monthly"));
        set.add(new Insurance(122,12346,124,"Sandeep","Akansha","Periodic"));
        set.add(new Insurance(121,123456,1234,"Yash","Aishwarya","Monthly"));
        set.add(new Insurance(122,12346,124,"Sandeep","Akansha","Periodic"));
        set.add(new Insurance(121,123456,1234,"Yash","Aishwarya","Monthly"));

        for(Insurance i: set) System.out.println(i);
    }
}
