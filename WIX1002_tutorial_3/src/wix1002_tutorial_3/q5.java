
package wix1002_tutorial_3;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        
        System.out.print("enter a year: ");
        int year=in.nextInt();
        
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println("this is a leap year");
        }
        else
            System.out.println("this is not a leap year");
    }
    
}
