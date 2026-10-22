
package wix1002_tutorial_3;
public class q1 {
    
    public static void main(String[] args) {
        
    }
    
    public static void a(){
        if (3 * 8 == 27) {
    System.out.println("Equal");
}
    }
    
    public static void b(int a){
        if(a%2 == 0){
            System.out.println("it's even");
        }
        else{
            System.out.println("it's odd");
        }
    }
    
    public static void c(char a){
        if(Character.isUpperCase(a)){
            System.out.println("it's capital letter");
    }
        else{
            System.out.println("it's not a capital letter");
        }
            
    }
    
    public static void d(String s1, String s2){
        if (s1.compareToIgnoreCase(s2) <= 0) {
             System.out.println(s1);
             System.out.println(s2);
         } 
        else {
             System.out.println(s2);
             System.out.println(s1);
        }
    }
    
    public static void e(int a){
        switch(a){
    case 0:
        System.out.println("Sunday");
        break;
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    default:
        System.out.println("Invalid input");
        break;
        }
        }
    }
    
    
   
    

