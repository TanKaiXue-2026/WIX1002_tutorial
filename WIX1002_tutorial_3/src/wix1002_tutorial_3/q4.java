
package wix1002_tutorial_3;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter first num: ");
        int a=in.nextInt();
        in.nextLine();
        
        System.out.print("enter second num: ");
        int b=in.nextInt();
        in.nextLine();
        
        System.out.print("enter third num: ");
        int c=in.nextInt();
        in.nextLine();
        
        if(a>b&&a>c){
            System.out.println(a+" ");
        }
        else if(b>a&&b>c){
             System.out.println(b+" ");
             }
        else if(c>a&&c>b){
            System.out.println(c+" ");
        }
        
        
    }
}
    
   

