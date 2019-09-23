package helloworld.ArrayAssignment;

import java.util.Arrays;

/*
Write a function that accepts start and end numbers.
Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end,
so start=5 and end=10 yields [5, 6, 7, 8, 9].
Sample Output:
fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
 */
public class D_Exercise08 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray(5,10)));
    }
    public static int[] fizzArray(int start, int end) {
        int[] newArr = new int[end-start];
        int n = start;
        for (int i = 0; i < (end-start) ; i++) {
            newArr[i] = n++;
        }
        return newArr;
    }
}
