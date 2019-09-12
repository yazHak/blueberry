package helloworld.ArrayAssignment;
/*
We'll say a number is special if it is a multiple of 11 or if it is one more than
a multiple of 11. Write a function that accepts a number and prints true if
the given number is special.
specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false
 */
public class B_Question3 {
    public static void main(String[] args) {
        System.out.println(specialEleven(24));
    }

    public static boolean specialEleven(int num) {
        boolean result = false;
        if(num%11==0 || num%11==1) result = true;
        return result;
    }
}
