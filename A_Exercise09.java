package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints a new array with double the length where its last element is the same as the original array,
and all the other elements are 0.
Sample Output:
makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
 */

import java.util.Arrays;

public class A_Question9 {
    public static void main(String[] args) {
        int [] myArr = {4,5,6};
        System.out.println(Arrays.toString(convertDoubleWthEnd(myArr)));
    }
    public static int [] convertDoubleWthEnd(int [] arr) {
        int [] newArr = new int[2*arr.length];
        newArr[newArr.length-1]=arr[arr.length-1];
        return newArr;
    }
}
