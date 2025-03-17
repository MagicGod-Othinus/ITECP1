package JAVA.LESSON.assignment.others;

public class typeCasting0 {
    
    public static void main(String[]arg){

        float a1 = 20;
        double a2 = a1;

        float b1 = 20;
        long b2 = (long)b1;

        double c1 = 20;
        float c2 = (float)c1;

        double d1 = 20;
        long d2 = (long)d1;

        long e1 = 20;
        float e2 = e1;

        long f1 = 20;
        double f2 = f1;


        System.out.println("\nfloat to double:\n" + a1 + "-->" + a2);
        
        System.out.println("\nfloat to long:\n" + b1 + "-->" + b2);

        System.out.println("\ndouble to float:\n" + c1 + "-->" +c2);

        System.out.println("\ndouble to long:\n" + d1 + "-->" + d2);

        System.out.println("\nlong to float:\n" + e1 + "-->" + e2);

        System.out.println("\nlong to double:\n" + f1 + "-->" + f2);

    }

}
