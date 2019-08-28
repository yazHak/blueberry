package helloworld.ArrayAssignment;

/*
Question-8
Write a function that accepts an array and prints true if it contains a 2 or a 3
Sample Output:
has23([2,5]); - >true
has23([4,3]); - >true
has23([4,5]); - >false
 */

public class A_Question8 {
    public static void main(String[] args) {
        int [] myArr1 = {2,5};
        int [] myArr2 = {4,3};
        int [] myArr3 = {4,5};

        has23(myArr1);
        has23(myArr2);
        has23(myArr3);
    }
    public static void has23(int[] arr) {
        for (int n:arr
             ) {
            if(n==2 || n==3) {
                System.out.println("true");
            }
            else System.out.println("false");
        }
    }
}
