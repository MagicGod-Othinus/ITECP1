public class admissionCheck3 {
    
    public static void main(String[]arg){

        byte gradeAverageReq = 75;
        byte examScoreReq = 70;
        byte recommendationReq = 1;

        byte gradeAverage = 75;
        byte examScore = 70;
        byte recommendation = 1;

        System.out.println("\nRequirements: Average Grade must be at least " + gradeAverageReq + ", Entrance Exam Score is at least " + examScoreReq + " and have at least " + recommendationReq + " Recommendation Letter.");

        System.out.println("Average Grade: " + gradeAverage);
        System.out.println("Entrance Exam Score: " + examScore);
        System.out.println("Number of Recommendation: " + recommendationReq);
        
        System.out.println("Eligible: " + (gradeAverage >= gradeAverageReq && examScore >= examScoreReq && recommendation >= recommendationReq));
    }
}
