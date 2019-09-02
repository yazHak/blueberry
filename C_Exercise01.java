package helloworld.ArrayAssignment;

import java.util.Arrays;

/*
Write a function that accepts an array, and if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Print the changed Array
Sample Output:
fix23([1,2,3]); - > [1,2,0]
fix23([2,0,5]); - > [2,0,5]
fix23([1,2,1]); - > [1,2,1]
fix23([11,2,13,3,2]); - >[11,2,13,3,2]
 */
public class C_Exercise01 {
    public static void main(String[] args) {
        int [] myArr = {1,2,3};
        int [] myArr1 = {2,0,5};
        int [] myArr2 = {1,2,1};
        int [] myArr3 = {11,2,13,3,2};
        int [] myArr4 = {11,2,13,3,2,3};
        C_Exercise01 obj = new C_Exercise01();

        System.out.println(Arrays.toString(obj.fix23(myArr)));
        System.out.println(Arrays.toString(obj.fix23(myArr2)));
        System.out.println(Arrays.toString(obj.fix23(myArr3)));
        System.out.println(Arrays.toString(obj.fix23(myArr4)));

    }
    public int[] fix23(int [] arr) {
        int [] newArr = new int[arr.length];
        newArr[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]==2 && arr[i]==3) {
                newArr[i] = 0;
            }
            else newArr[i]=arr[i];
        }
        return newArr;
    }
}
