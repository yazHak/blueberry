package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints true if the array contains a 2 next to a 2 somewhere.
Sample Output:
has22([1, 2, 2]); ->true
has22([1, 2, 1, 2]); ->false
has22([2, 1, 2]); ->false
has22([2,2, 1, 2]); ->true
 */
public class C_Exercise10 {
    public static void main(String[] args) {
        int [] myArr = {2,2, 1, 2};
        System.out.println(has22(myArr));
    }
    public static boolean has22(int [] arr) {
        boolean result=false;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]==2 && arr[i-1]==2) {
                result = true;
            }
        }
        return result;
    }
}
