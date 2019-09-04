package helloworld.ArrayAssignment;

import java.util.Arrays;

/*
Write a function that accepts 2 arrays and prints a new array containing all their elements
Sample Output:
plusTwo([1, 2], [3, 4]); - >[1,2,3,4]
plusTwo([4, 4], [2, 2]); - >[4,4,2,2]
plusTwo([9, 2], [3, 4]); - >[9,2,3,4]
 */
public class C_Exercise04 {
    public static void main(String[] args) {
        int [] myArr1 = {1,2};
        int [] myArr2 = {3,4};
        System.out.println(Arrays.toString(plusTwo(myArr1,myArr2)));
    }
    public static int[] plusTwo(int [] arr1, int[] arr2) {
        int [] newArr = new int[arr1.length+arr2.length];
        int t=0;
        for (int i = 0; i <arr1.length+arr2.length ; i++) {
            if(i<arr1.length) {newArr[i] = arr1[i];}
            else {newArr[i]=arr2[t];t++;}
        }
        return newArr;
    }
}
