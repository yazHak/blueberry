package helloworld.ArrayAssignment;
/*
Question-7
Write a function that accepts 2 arrays and prints the second array containing the first and last elements from the first array.
Sample Output:
makeEnds([1,2,3],[]); - >[1,3]
makeEnds([1,2,3,4],[]); - >[1,4]
makeEnds([7,4,6,2],[]); - >[7,2]
 */

import java.util.Arrays;

public class A_Question7 {
    public static void main(String[] args) {
        int [] myArr1 = {1,2,3,4};
        int [] myArr2 = {7,4,6,2};

        makeEnds(myArr1);
        makeEnds(myArr2);

    }
    public static void makeEnds(int[]arr) {
        int[] arr2 = new int[2];
        arr2[0]=arr[0];
        arr2[1]=arr[arr.length-1];
        System.out.println(Arrays.toString(arr2));
    }
}
