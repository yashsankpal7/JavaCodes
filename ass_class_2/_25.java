package ass_class_2;

import java.util.Scanner;

public class _25 {
    private int id;
    private String name;
    private String policy_name;

    public _25(int id,String name,String policy_name) {
        this.id = id;
        this.name = name;
        this.policy_name = policy_name;
    }

    @Override
    public String toString() {
        return "_25{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", policy_name='" + policy_name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        _25 pom = new _25(123,"yash","DXECW12W1");
        System.out.println(pom);

    }
}
