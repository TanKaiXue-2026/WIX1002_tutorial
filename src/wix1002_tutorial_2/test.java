/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_tutorial_2;
    import java.util.Scanner;

/**
 *
 * @author user
 */
public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value in inch: ");
        double inches = scanner.nextDouble();
        
        // 1 inch = 2.54 cm = 0.0254 meters
        double meters = inches * 0.0254; 
        
        System.out.printf("%.2f inches = %.2f meters\n", inches, meters);
        scanner.close();
    }

}
