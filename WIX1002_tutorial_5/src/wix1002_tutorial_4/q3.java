
package wix1002_tutorial_4;


public class q3 {
    public static void main(String[] args) {
// int[] marks = new int[5]; creates an array: [0, 0, 0, 0, 0].

//int i = 0, j = 1; initializes the variables.

//marks[i] = 12; sets index 0 to 12. Array is now [12, 0, 0, 0, 0].

//marks[j] = marks[i] + 19; sets index 1 to (12 + 19). Array is now [12, 31, 0, 0, 0].

//marks[j-1] = marks[j] * marks[j]; sets index 0 to (31 * 31). Array is now [961, 31, 0, 0, 0].

//marks[j*3] = marks[i+1]; sets index 3 to the value at index 1. Array is now [961, 31, 0, 31, 0].

//marks[++j] = marks[i]%5; first increases j to 2, then sets index 2 to (961 % 5). The remainder of 961 divided by 5 is 1. Array is now [961, 31, 1, 31, 0].

//marks[2*j] = marks[j-1]; uses j=2 to set index 4 to the value at index 1. Array is now [961, 31, 1, 31, 31].
    }
}
