package helloworld.ArrayAssignment;
/*
A value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value.
Write a function that accepts an array and a number, and prints true if the given number is everywhere in the array.
Sample Output:
isEveryWhere([1, 2, 1, 3], 1); - >true
isEveryWhere([1, 2, 1, 3], 2); - >false
isEveryWhere([1, 2, 1, 3, 4], 1); - >true
isEveryWhere([1, 2, 4, 3, 1], 1); - >false
 */
public class D_Exercise04 {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 1, 3, 1};
        System.out.println(isEveryWhere(myArr,1));

    }
    public static boolean isEveryWhere(int[] arr, int num) {
        boolean result=true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==num || arr[i-1]==num) {result=true;}
            else result=false;
        }
        return result;
    }
}
