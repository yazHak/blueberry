package helloworld.ArrayAssignment;

import java.util.Arrays;

/*
Write a function that accepts a number and create and prints a new array of length number,
containing the numbers 0,1,2,...number-1.
Sample Output:
fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
public class D_Exercise03 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray(4)));

    }
    public static int [] fizzArray(int number) {
        int [] newArr = new int[number];
        for (int i = 0; i < number ; i++) {
            newArr[i]=i;
        }
        return newArr;
    }
}
