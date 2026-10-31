
package wix1002_tutorial_4;


import java.util.Random;

public class q6 {
    public static void main(String[] args) {
        Random random = new Random();
              
        int num = random.nextInt(256); 
        System.out.println("Random Number Generated: " + num);

        int[] binary= new int[8];
        int temp = num;

        for (int i = 7; i >= 0; i--) {
            binary[i] = temp % 2;
            temp = temp / 2;
        }

        System.out.print("Binary representation: ");
        for (int i = 0; i < binary.length; i++) {
            System.out.print(binary[i]);
        }
        System.out.println();
    }
}