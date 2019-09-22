package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints true if the array contains,somewhere,three increasing adjacent numbers like 4,5,6,... or 23,24,25.
Sample Output:
tripleUp([1, 4, 5, 6, 2]); ->true
tripleUp([1, 2, 3]); ->true
tripleUp([1, 2, 4]); ->false
tripleUp([1, 2, 4, 5, 8, 9]); ->false
 */
public class D_Exercise07 {
    public static void main(String[] args) {
        int[] myArr={1, 2, 3};
        System.out.println(tripleUp(myArr));

    }
    public static boolean tripleUp(int[] arr) {
        boolean result=false;

        for (int i = 2; i < arr.length ; i++) {
            if(arr[i]-arr[i-1]==1 && arr[i-1]-arr[i-2]==1) {
                result=true;
                break;
            }
        }
        return result;
    }
}
