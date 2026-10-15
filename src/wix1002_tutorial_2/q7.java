package wix1002_tutorial_2;
import java.util.Scanner;

public class q7 {
    
    public static double convert( double a){
        a=(a*2.54)/100;
        return a;
}
    
    public static void main(String[] args) {
        Scanner length=new Scanner (System.in);
        double temp;
        System.out.print("Enter value in inch: ");
        temp=length.nextDouble();
        double finalresult = convert(temp);
        System.out.printf("%.2f inches = %.2f meters\n", temp, finalresult);
                
        
    }
}