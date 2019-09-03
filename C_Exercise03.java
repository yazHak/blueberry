package helloworld.ArrayAssignment;
/*
Write a function that accepts 2 arrays and consider the sum of the values in each array.
Print the array which has the largest sum. In event of a tie, print "equal"
Sample Output:
biggerTwo([1, 2], [3, 4]); - >[3,4]
biggerTwo([5, 6], [3, 8]); - >equal
biggerTwo([1, 1], [1, 0]); - >[1,1]
 */

import java.util.Arrays;

public class C_Exercise03 {
    public static void main(String[] args) {
        int[] myArr1 = {1,1};
        int[] myArr2 = {1,0};
        biggerTwo(myArr1,myArr2);
    }
    public static void biggerTwo(int[] arr1, int [] arr2) {
        int maxMulti1=findMax(arr1);
        int maxMulti2=findMax(arr2);

        if(maxMulti1==maxMulti2) System.out.println("--> equal");
        else if(maxMulti1>maxMulti2) System.out.println(Arrays.toString(arr1));
        else System.out.println(Arrays.toString(arr2));
    }

    public static int findMax(int[] arr) {
        int multi=0;
        for (int i = 0; i < arr.length; i++) {
            multi=multi+arr[i];
        }
        return multi;
    }
}
