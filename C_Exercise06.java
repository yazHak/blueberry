package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints the number of even numbers in the array.
Sample Output:
Sample Output:
countEvens([2, 1, 2, 3, 4]) ->3
countEvens([2, 2, 0]) ->3
countEvens([1, 3, 5]) ->0
 */
public class C_Exercise06 {
    public static void main(String[] args) {
        int [] myArr = {1,3,5};
        System.out.println(countEvens(myArr));

    }
    public static int countEvens(int [] arr) {
        int count=0;
        for (int n:arr
             ) {
            if(n%2==0) count++;
        }
        return count;
    }
}
