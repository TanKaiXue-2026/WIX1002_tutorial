/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_tutorial04;

/**
 *
 * @author simjiayi
 */
import java.util.Random;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        
        // a 
        System.out.println("a. ");
        int n = 0;
        
        while ( (n * n * n) < 2000){
            
            n++;
        }
        n--;
                
        System.out.println("The larger integer so that the cube of n is less than 2000 is " + n);
        
        //b
        System.out.println("b. ");
        for (int b = 1 ; b <= 12 ; b++){ 
            
            System.out.println(b + ": " + (b * b));
        }
        
        //c
        System.out.println("c. ");
        Random rand = new Random();
        int [][] arr = new int[4][5];
        
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                arr [i][j] = rand.nextInt(101);
        
            }
        }
        for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                System.out.print(arr[i][j] + "\t"); 
            }
            System.out.println();
        }
        
        //d
        System.out.println("d. ");
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int d1 = in.nextInt();
        int d2 = 0;
        
        for (int i = 1 ; i <= d1 ; i++){ 
            d2 += i;
    }
        System.out.println("The sum is " + d2);
        
        //e
        System.out.println("e. ");
        double e1 = 0.00;
        
        for (int i = 1, j = 25; i <= 25; i++, j--) {
         
            double e2 = (double) i / j;
            e1 += e2;
        }
        System.out.printf("The sum is %.2f" , e1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
