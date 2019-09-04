package helloworld.ArrayAssignment;

import java.util.Arrays;

/*
Write a function that accepts an array and swap the first and last element in the array. Print the modified array
Sample Output:
swapEnds([1, 2, 3, 4]) -> [4,2,3,1];
swapEnds([1, 2, 3]) -> [3,2,1]
swapEnds([8, 6, 7, 9, 5]) -> [5,6,7,9,8]
 */
public class C_Exercise05 {
    public static void main(String[] args) {
        int [] myArr ={8,6,7,9,5};
        System.out.println(Arrays.toString(swapEnds(myArr)));

    }
    public static int [] swapEnds(int [] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        return arr;
    }
}
