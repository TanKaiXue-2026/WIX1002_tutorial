
    package wix1002_tutorial_2;

    import java.util.Scanner;

    public class q6 {

        public static double circumference(double a){
            a=a/2;
            double result=2*Math.PI*a;
            return result;
        }

        public static void main(String[] args) {
            Scanner cm=new Scanner(System.in);
            double diameter;
            System.out.print("enter the diameter of circle: " );
            diameter = cm.nextDouble();
            double finalresult= circumference(diameter);
            
            System.out.printf("The circumference of the circle is: %.3f\n", finalresult);
        }
    }
