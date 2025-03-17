public class admissionCheck2 {
    
    public static void main(String[]arg){

        byte gradeAverageReq = 80;
        byte examScoreReq = 75;
        byte participationReq = 2;


        byte gradeAverage = 0;
        byte examScore = 0;
        byte participation = 0;

        System.out.println("\nRequirements: Average Grade must be at least " + gradeAverageReq + ", Entrance Exam Score is at least " + examScoreReq + " and participated in extracurricular activities atleast " + participationReq + " times.");

        System.out.println("Average Grade: " + gradeAverage);
        System.out.println("Entrance Exam Score: " + examScore);
        System.out.println("Number of Participation: " + participation);

        System.out.println("Eligible: " + (gradeAverage >= gradeAverageReq && examScore >= examScoreReq && participation >= participationReq));
    }
}
