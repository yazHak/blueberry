package helloworld.ArrayAssignment;

import java.util.Arrays;

public class A_Question6 {
    public static void main(String[] args) {
        int [] myArr = {1,2,3,4};
        System.out.println(Arrays.toString(findMax(myArr)));
    }
    public static int [] findMax(int [] arr) {
        int [] maxArr = new int[arr.length];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) {max=arr[i];}
        }
        for (int i = 0; i < arr.length; i++) {
            maxArr[i]=max;
        }
        return maxArr;
    }
}
