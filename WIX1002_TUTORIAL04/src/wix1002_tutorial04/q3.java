/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wix1002_tutorial04;

/**
 *
 * @author simjiayi
 */
public class q3 {
    public static void main(String[] args) {
        
        int f1 = 1, f2 = 1, fn;
        
System.out.print(f1 + ", " + f2);
for (int i = 3; i <= 10; i++) {
    fn = f1 + f2;
    System.out.print(", " + fn);
    f1 = f2;
    f2 = fn;
}




    }
}