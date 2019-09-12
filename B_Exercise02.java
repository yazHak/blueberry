package helloworld.ArrayAssignment;
/*
The number 6 is a truly great number. Write a function that accepts num1 and num2, prints true if either one is 6. Or if their sum or difference is 6.
love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
love6(12, 6); ->true
 */
public class B_Question2 {
    public static void main(String[] args) {
        System.out.println(love6(1,4));
    }
    public static boolean love6(int num1, int num2) {
        boolean result=true;
        int add = num1+num2;
        int sub = Math.abs(num1-num2);
        if(num1==6 || num2==6 || add==6 || sub==6) {
            return result;
        }
        else result=false;
        return result;
    }
}
