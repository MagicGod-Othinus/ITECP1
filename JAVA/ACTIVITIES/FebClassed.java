//package JAVA.ACTIVITIES;

public class FebClassed {
    

    public static void main(String[]arg){

        double avocado = 20;
        double banana = 50;
        double carrot = 15;
        double durian = 40;
        double eggplant = 25;

        System.out.println("avocado: " + avocado);
        System.out.println("banana: " + banana);
        System.out.println("carrot: " + carrot);
        System.out.println("durian: " + durian);
        System.out.println("eggplant: " + eggplant);



        short discount = 15;
        double discountPercent = discount * 0.01;

        double initialTotal = avocado + banana + carrot + durian + eggplant;

        //avocado = avocado - (avocado * discountPercent);
        //banana = banana - (banana * discountPercent);
        //carrot = carrot - (carrot * discountPercent);
        durian = durian - (durian * discountPercent);
        eggplant = eggplant - (eggplant * discountPercent);


        System.out.println("\n\ndurian discounted: " + durian);
        System.out.println("eggplant discounted: " + eggplant);

        

        double total = avocado + banana + carrot + durian + eggplant;


        System.out.println("\n\nOriginal Price: " + initialTotal);
        System.out.println("Discount for each items selected: " + discount + "%");
        System.out.println("With Discount: " + total);

        

        
  

        
    }


}
