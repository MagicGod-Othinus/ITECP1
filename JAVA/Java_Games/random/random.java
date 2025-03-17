package JAVA.Java_Games.random;

//import java.util.Scanner;
public class random{

    public static void main(String[] args){

        int random = (int) (Math.random() * 11);
        int i = 0;
        //Scanner input = new Scanner(System.in);

        if(random == i){
            System.out.println("WOW! you're lucky");
        }
        else{
            System.out.println("Tough Luck");
        }

    }
}
