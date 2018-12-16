package pl.kodu.akademia;

public class Main {
    public static void main(String[] args) {
        MyWater myWater = new MyWater();
        myWater.addLarge(2);
        myWater.addMedium(2);
        myWater.addSmall(1);
        System.out.println(myWater.getTotalAmount());

    }

}
