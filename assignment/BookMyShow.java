package assignment;

import java.util.Scanner;

public class BookMyShow {
    private int id;
    private String showName;
    private int alotSeat;

    private int cost=300;
    private boolean houseFull=false;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getShowName() {
        return showName;
    }
    public void setShowName(String showName) {
        this.showName = showName;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public boolean isHouseFull() {
        return houseFull;
    }
    public void setHouseFull(boolean houseFull) {
        this.houseFull = houseFull;
    }
    public int getAlotSeat() {
        return alotSeat;
    }
    public void setAlotSeat(int alotSeat) {
        this.alotSeat = alotSeat;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BookMyShow bms = new BookMyShow();

        System.out.println("Enter ID");
        bms.setId(sc.nextInt());

        System.out.println("Enter Name");
        bms.setShowName(sc.next());

        System.out.println("Enter alot seat");
        bms.setAlotSeat(sc.nextInt());

        System.out.println("ID "+bms.getId()+" Show Name "+bms.getShowName()+" total seats "+bms.getAlotSeat());

        bms.setHouseFull(true);
        System.out.println("Houseful "+bms.isHouseFull());

    }
}
