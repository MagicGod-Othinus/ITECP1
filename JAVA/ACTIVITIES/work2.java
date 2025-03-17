public class work2{
    public static void main(String[]arg){

        byte yearsWorked = 5;
        byte performanceRating = 5;
        float currentSalary = 1000f;
        byte completedProjects = 10;
        Boolean leadershipRole = true;


   


        if(yearsWorked >= 5 && performanceRating >= 4){
            currentSalary += (currentSalary * .10);
        }
        else if(yearsWorked >= 3 && performanceRating >= 3){
            currentSalary += (currentSalary * .05);
        }
       

        
        


        if (yearsWorked >= 5 && performanceRating >= 4 || yearsWorked >= 3 && performanceRating >= 3 && completedProjects >= 10 || completedProjects >= 5 && performanceRating == 5 && leadershipRole == true) {
            System.out.println("Eligible for Everything\n\n");
        }
        else if (yearsWorked >= 5 && performanceRating >= 4 || yearsWorked >= 3 && performanceRating >= 3 && completedProjects >= 10 || completedProjects >= 5) {
            System.out.println("Salary Increase and Bonus, No Promotion\n\n");
        }
        else{
            System.out.println("No Salary Increase, No Bonus, No Promotion\n\n");
        }
       

        System.out.println("New Salary: " + currentSalary);

        if (completedProjects >= 10) {
            System.out.println("Bonus: P5000");
            
        }
        else if (completedProjects >= 5) {
            
            System.out.println("Bonus: P2500");
        }

        if (performanceRating == 5 && leadershipRole == true) {
            System.out.println("Promoted!");
        }

       


        
    }
}