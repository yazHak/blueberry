package helloworld.ArrayAssignment;

import java.util.Arrays;

/*
Write a function that accepts an array. For each multiple of 10 in the given array,
change all the values following it to be that multiple of 10, until encountering another multiple of 10.
Sample Output:
tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 */
public class D_Exercise09 {
    public static void main(String[] args) {
        int [] myArr= {10, 1, 9, 20};
        System.out.println(Arrays.toString(tenRun(myArr)));

    }
    public static int [] tenRun(int [] arr) {
        int [] newArr = new int[arr.length];
        int ten=arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            newArr[i]=ten;
            if(arr[i]%10==0) {ten=arr[i];}
            if(arr[i+1]%10==0) {ten=arr[i+1];}
        }
        newArr[arr.length-1]=ten;
        return newArr;
    }
}
