public class gradingClass{

    public static void main(String[]args){

        byte grade = 110;

        System.out.println("GRADING SCALE\n");

        if(grade > 100){
            System.out.println("Percent Grade: " + grade + " What is that grade???");
        }
        else if(grade >= 93){
            System.out.println("Percent Grade: " + grade + " Letter Grade: A|| Grade Points: 4");
        }
        else if(grade >= 90){
            System.out.println("Percent Grade: " + grade + " Letter Grade: A-|| Grade Points: 3.7");
        }
        else if(grade >= 87){
            System.out.println("Percent Grade: " + grade + " Letter Grade: B+|| Grade Points: 3.3");
        }
        else if(grade >= 83){
            System.out.println("Percent Grade: " + grade + " Letter Grade: B|| Grade Points: 3");
        }
        else if(grade >= 80){
            System.out.println("Percent Grade: " + grade + " Letter Grade: B-|| Grade Points: 2.7");
        }
        else if(grade >= 77){
            System.out.println("Percent Grade: " + grade + " Letter Grade: C+|| Grade Points: 2.3");
        }
        else if(grade >= 73){
            System.out.println("Percent Grade: " + grade + " Letter Grade: C|| Grade Points: 2");
        }
        else if(grade >= 70){
            System.out.println("Percent Grade: " + grade + " Letter Grade: C-|| Grade Points: 1.7");
        }
        else if(grade >= 67){
            System.out.println("Percent Grade: " + grade + " Letter Grade: D+|| Grade Points: 1.3");
        }
        else if(grade >= 65){
            System.out.println("Percent Grade: " + grade + " Letter Grade: D|| Grade Points: 1");
        }
        else if(grade < 65){
            System.out.println("Percent Grade: " + grade + " Letter Grade: F|| Grade Points: 0");
        }
        else{
            System.out.println("What is that grade???");
        }
    }
}