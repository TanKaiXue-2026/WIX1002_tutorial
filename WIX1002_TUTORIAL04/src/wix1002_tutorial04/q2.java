/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_tutorial04;

/**
 *
 * @author simjiayi
 */
public class q2 {
    public static void main(String[] args) {
       
        //a
        System.out.println("a. ");
        int sum = 0;
        for (int x = 10; x > 0; x--) {
            sum += x;
        }
        System.out.println("Sum: " + sum);

        //b
        System.out.println("b. ");
        int x = 0, y = 0;
        do {
            x += 2;
            y += x;
            System.out.println(x + " and " + y);
        } while (x < 100);

        //c
        System.out.println("c. ");
        for (int x2 = -1, y2 = 20; x2 < y2; x2++, y2 -= 2) {
            System.out.println(x2 + " " + y2);
        }

        //d
        System.out.println("d. ");
        int i = 1;
        while (i <= 10) {
            if (i == 10) {
                System.out.println("Program End");
            }
            i++;
        }
    }
}
