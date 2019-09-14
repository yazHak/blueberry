package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints true if the number 1's is greater than the number 4's
Sample Output:
more14([1, 4, 1]); ->true
more14([1, 4, 1, 4]); ->false
more14([1, 1]); ->true
 */
public class D_Exercise02 {
    public static void main(String[] args) {
        int[]myArr={1,4,1,4,4,1,1};
        System.out.println(more14(myArr));
    }
    public static boolean more14(int [] arr) {
        boolean result=false;
        int ones=0;
        int fours=0;
        for (int num:arr
             ) {
            if(num==1) {ones++;}
            if(num==4) {fours++;}
        }
        if(ones>fours) {result = true;}
        return result;
    }
}
