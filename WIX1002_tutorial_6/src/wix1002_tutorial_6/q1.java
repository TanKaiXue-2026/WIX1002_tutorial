
package wix1002_tutorial_6;


public class q1 {
    
    public static void a(int a, int b, int c){
        if(a>b||a>c){
            System.out.println("the max is: "+a);
        }
        else if(b>c||b>a){
            System.out.println("the max is: "+b);
        }
        else if(c>a||c>b){
            System.out.println("the max is: "+c);
        }
        else{
            System.out.println("same number");
        }
    }
    
    public static void b(int a){
        if(a<0){
            System.out.println("invalid input");
        }
        int sqrt=(int)Math.sqrt(a);
        if((sqrt*sqrt)==a||((sqrt+1)*(sqrt+1))==a){
            System.out.println("this is a square number");
        }
    }
    
    public static long factorial(int num) {
      long result = 1;
      for (int i = 1; i <= num; i++) {
          result = result * i;
      }
      return result;
  }
    
    public static void c(int n, int k){
        if (k < 0 || k > n) {
            System.out.println("invalid");
      }
        long a = factorial(n);       
        long b = factorial(k);   
        long c = factorial(n - k); 
        
        long result=a/(b+c);
        System.out.println(result);
    }
    
    public static boolean d(int num){
     if (num <= 0) {
          return false;
      }

      int n = 1;
      while (true) {
          int p = n * (3 * n - 1) / 2;
          if (p == num) {
              return true;
          }
          if (p > num) {
              return false;
          }
          n++; 
      }
}
    
    public static void e(String a){
      int letterCount = 0;
      int digitCount = 0;

      for (int i = 0; i < a.length(); i++) {
          char ch = a.charAt(i);

          if (Character.isLetter(ch)) {
              letterCount++;
          }
 
          else if (Character.isDigit(ch)) {
              digitCount++;
          }
      }
      System.out.println("letter: " + letterCount);
      System.out.println("digit: " + digitCount);
    }
    
    public static void f(int[] num){
        for (int i = 0; i < 10; i++) {
          num[i] = (int) (Math.random() * 101); 
      }
    }
    
    
    public static void g(double radius,double[] result){
        double area=Math.PI*radius*radius;
        double cirrcumference=2*Math.PI*radius;
        
        result[0]=area;
        result[1]=cirrcumference;
        
    }
    
    public static int h(){
        int[] num=new int[11];
        
        while(true){
            int randomNum = (int) (Math.random() * 11); 
            num[randomNum]++;
            
          if (num[randomNum] == 2) {
              return randomNum;
        }
    }

    }
    
    
    public static void main(String[] args) {
        
    }
    
}
