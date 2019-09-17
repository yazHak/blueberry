package helloworld.ArrayAssignment;
/*
Write a function that accepts two arrays of the same length. For every element in array1, consider the corresponding element
in array2 (at the same index). Return the count of the number of times that two elements differ by 2 or less, but are not equal.
Sample Output:
matchUp([1, 2, 3], [2, 3, 10]); ->2
matchUp([1, 2, 3], [2, 3, 5]); ->3
matchUp([1, 2, 3], [2, 3, 3]); ->2
 */
public class D_Exercise05 {
    public static void main(String[] args) {
        int[] myArr1= {1,2,3};
        int[] myArr2= {2,3,3};
        System.out.println(matchUp(myArr1,myArr2));

    }
    public static int matchUp(int[] arr1, int [] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length ; i++) {
            if(Math.abs((arr1[i]-arr2[i]))<=2 && arr1[i]!=arr2[i]) count++;
        }
        return count;
    }
}
