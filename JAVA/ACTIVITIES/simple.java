public class simple {
    
    public static void main(String[]arg){
        int allowance = 500;
        int fare = 200;
        int food = 50;

        System.out.printf("Allowance: %d - (Fare: %d + Food: %d) = Remaining Allowance: %d\n", allowance, fare, food, allowance = allowance - (fare + food));
    }
}
