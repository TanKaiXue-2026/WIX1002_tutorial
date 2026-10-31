
package wix1002_tutorial04;


import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter: ");
        String str = in.nextLine();
        
        String reversed = "";
        
        for (int i = str.length() ; i >= 0; i--) {
            reversed += str.charAt(i-1);
        }
        System.out.println(reversed);
    }
  
    
}
