package helloworld.ArrayAssignment;
/*
Write a function that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
public class B_Question1 {
    public static void main(String[] args) {
        B_Question1 myObj = new B_Question1();
        myObj.stringTimes("Hi", 1);
    }

    public void stringTimes(String str, int num) {
        String newStr = "";
        for (int i = 0; i < num ; i++) {
            newStr = newStr + str;
        }
        System.out.println(newStr);
    }
}
