package JAVA.Projects.idk;
import java.util.Scanner;

public class idk {
    
    public static void main(String[]arg){

        byte loop = 0;
        
        System.out.print("Exit[0] Register[1] Login[2]\n: ");

        Scanner scan = new Scanner(System.in);

        do{
            try{
                byte input = scan.nextByte();

                switch(input){
                    case 0:{
                        System.out.println("Exiting...");
                        return;
                    }
                    case 1:{
                        System.out.println("Coming Soon");
                        break;
                    }
                    case 2:{
                        System.out.println("Coming Soon");
                        break;
                    }
                    default: {
                        System.out.println("No Plans Yet");
                        break;
                    }
                }
            }
            catch(Exception e){
                System.out.println("Invalid Output");
                scan.nextLine();
            }
        }while(loop == 1);

        scan.close();
        

    }
        

}
