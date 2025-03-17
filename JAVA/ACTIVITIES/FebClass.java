//package JAVA.ACTIVITIES;

public class FebClass {
    

    public static void main(String[]arg){

        short avocado = 20;
        short banana = 50;
        short carrot = 15;
        short durian = 40;
        short eggplant = 25;


        short discount = 15;
        double discountPercent = discount * 0.01;

        
        int total = avocado + banana + carrot + durian + eggplant;
        double discountAmount = total * discountPercent;


        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount + "%");
        System.out.println("FINAL: " + (total - discountAmount));

        
    }


}
