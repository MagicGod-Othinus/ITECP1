public class work{
    public static void main(String[]arg){

        byte yearsWorked = 30;
        byte performanceRating = 5;
        float currentSalary = 1000f;
        byte completedProjects = 100;
        Boolean leadershipRole = true;


        System.out.println("Current Salary: P" + currentSalary);


        if(yearsWorked >= 5 && performanceRating >= 4){
            //System.out.println("\nEligible for 10% Salary Increase");
            System.out.println("\nSalary Increase: P" + currentSalary * .10);
            currentSalary += (currentSalary * .10);
        }
        else if(yearsWorked >= 3 && performanceRating >= 3){
            System.out.println("\nEligible for 5% Salary Increase");
            System.out.println("\nSalary Increase: P" + currentSalary * .05);
            currentSalary += (currentSalary * .05);
        }
        else{
            System.out.println("No Promotion");
        }


        if (completedProjects >= 10) {
            System.out.println("Bonus: P5000");
            
        }
        else if (completedProjects >= 5) {
            System.out.println("Bonus: P2500");
            
        }
        else{
            System.out.println("No Bonus");
        }


        if (performanceRating == 5 && leadershipRole == true) {
            System.out.println("Promoted!");
        }
        else{
            System.out.println("No Promotion");
        }


        System.out.println("Updated Salary: " + currentSalary);
    }
}