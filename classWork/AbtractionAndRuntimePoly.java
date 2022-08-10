package classWork;

interface ICar_{
    void display();

}

class BMW implements ICar_{

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("BMW");
    }

}

class Ferrari implements ICar_{

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Ferrari");
    }

}

public class AbtractionAndRuntimePoly {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        BMW bmw = new BMW();
        Ferrari ferrari = new Ferrari();

        bmw.display();
        ferrari.display();
    }
}
