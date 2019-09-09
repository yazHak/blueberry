package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and print the difference between the largest and smallest values in the array.
Sample Output:
bigDiff([10, 3, 5, 6]); → 7
bigDiff([7, 2, 10, 9]); → 8
bigDiff([2, 10, 7, 2]); → 8
 */
public class C_Exercise07 {
    public static void main(String[] args) {
        int[] myArr = {2,10,7,2};
        System.out.println(bigDiff(myArr));

    }
    public static int bigDiff(int [] arr) {
        int min=arr[0];
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        return max-min;
    }
}
