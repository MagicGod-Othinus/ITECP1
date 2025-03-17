public class admissionCheck {
    
    public static void main(String[]arg){

        byte gradeAverageReq = 85;
        byte examScoreReq = 80;

        byte gradeAverage = 0;
        byte examScore = 0;

        System.out.println("\nRequirements: Average Grade must be at least " + gradeAverageReq + " and Entrance Exam Score is at least " + examScoreReq);

        System.out.println("Average Grade: " + gradeAverage);
        System.out.println("Entrance Exam Score: " + examScore);

        System.out.println("Eligible: " + (gradeAverage >= gradeAverageReq && examScore >= examScoreReq));
    }
}
