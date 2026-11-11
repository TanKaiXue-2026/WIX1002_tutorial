
package wix1002_tutorial_6;

public class q2 {
    public static void DecreasingOrder(int a, int b, int c) {
      int[] numbers = {a, b, c};

      for (int i = 0; i < numbers.length - 1; i++) {
          for (int j = 0; j < numbers.length - 1 - i; j++) {
              if (numbers[j] < numbers[j + 1]) {
                  int temp = numbers[j];
                  numbers[j] = numbers[j + 1];
                  numbers[j + 1] = temp;
              }
          }
      }
      System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
  }
    
    
    public static void main(String[] args) {
        
    }
}
