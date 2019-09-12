package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints the number of 9 s in the array
arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */

public class B_Question5 {
    public static void main(String[] args) {
    int [] myArr = {1,9,9,3,9};
        System.out.println(arrayCount9(myArr));
    }

    public static int arrayCount9(int [] arr) {
        int count=0;
        for (int nine:arr
             ) {
            if(nine==9) count++;
        }
        return count;
    }
}
