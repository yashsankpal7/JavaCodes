package assignment;

interface ICar {
    public void display();
    public void showModelName();
}

interface Wheeler2  extends ICar {
    void showBikeType();
}

interface Wheeler4  extends ICar {
    void showCarType();
}

class Wheel2  implements Wheeler2 {

    private String model,type;

    Wheel2(String model,String type){
        this.model=model;
        this.type=type;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println(model+"  "+type);
    }

    @Override
    public void showModelName() {
        // TODO Auto-generated method stub
        System.out.println(model);
    }

    @Override
    public void showBikeType() {
        // TODO Auto-generated method stub
        System.out.println(type);
    }

}


class Wheel4  implements Wheeler4 {

    private String model,type;

    Wheel4(String model,String type){
        this.model=model;
        this.type=type;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println(model+"  "+type);
    }

    @Override
    public void showModelName() {
        // TODO Auto-generated method stub
        System.out.println(model);
    }

    @Override
    public void showCarType() {
        // TODO Auto-generated method stub
        System.out.println(type);
    }

}


public class GenericInterfaces {
    public static void main(String[] args) {
        Wheeler2 wheel2 = new Wheel2("Ola","Electric");
        Wheeler4 wheel4 = new Wheel4("Fortuner","SUV");

        wheel2.display();
        wheel2.showModelName();
        wheel2.showBikeType();

        wheel4.display();
        wheel4.showModelName();
        wheel4.showCarType();
    }
}
