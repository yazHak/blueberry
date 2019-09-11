package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints the sum of the numbers in the array. Except the number 13 is
very unlucky,so it does not count and numbers that come immediately after a 13 also do not count
Sample Output:
sum13([1, 2, 2, 1]); ->6
sum13([1, 1]); ->2
sum13([1, 2, 2, 1, 13]); ->6
sum13([1, 2, 2, 1, 13,3]); ->6
 */
public class C_Exercise08 {
    public static void main(String[] args) {
        int[] myArr={13,1,2,2,1,13,3,5};
        System.out.println(sum13(myArr));
    }
    public static int sum13(int [] arr) {
        int sum=0;
        if(arr[0]!=13) {
            sum=arr[0];
            for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 13) i++;
            else sum = sum + arr[i];
            }
        }
        else {
            sum=arr[2];
            for (int i = 3; i < arr.length; i++) {
            if(arr[i]==13) i++;
            else sum=sum+arr[i];
            }
        }
        return sum;
    }
}
