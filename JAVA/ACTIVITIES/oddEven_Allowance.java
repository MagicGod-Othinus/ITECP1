//package JAVA.ACTIVITIES;

import java.util.Scanner;

public class oddEven_Allowance {

     static void oddEven(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = scan.nextInt();

        scan.close();

        if(input % 2 == 0){
            System.out.printf("%d is an even number", input);
        }
        else{
            System.out.printf("%d is an odd number", input);
        }        
    }

    static void allowance(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter allowance: ");
        int allowance = scan.nextInt();

        System.out.println("Enter fare expense: ");
        int fare = scan.nextInt();

        System.out.println("Enter food expenses: ");
        int food = scan.nextInt();

        scan.close();

        System.out.printf("Allowance: %d - (Fare: %d + Food: %d) = Remaining Allowance: %d\n", allowance, fare, food, allowance = allowance - (fare + food));

        if(allowance < 0){
            System.out.println("You have debt bruh\n");
        }        
    }
    
    public static void main(String[]arg){

        byte loop = 0;
        System.out.println( "OddEven[0] Allowance[1]");

        do{
            loop = 0;
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
    
            switch(choice){
                case 0:{
                    oddEven();
                    break;
                }
                case 1:{
                    allowance();
                    break;
                }
                default:{
                    System.out.println("non");
                    loop = 1;
                }
            }
            scan.close();


        }while(loop == 1);
    }

}
