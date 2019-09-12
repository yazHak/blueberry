package helloworld.ArrayAssignment;
/* ! ! ! UNSOLVED ! ! !
Write a function that accepts an array and prints the total of the numbers in the array, except ignore sections
of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
Sample Output:
sum67([1, 2, 2]); ->5
sum67([1, 2, 2, 6, 99, 99, 7]); ->5
sum67([1, 1, 6, 7, 2]); ->4
sum67([1, 1, 6, 2]); ->2
sum67([1, 2, 2, 6, 99, 99, 7,3,4]); ->12
 */
public class C_Exercise09 {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 2, 6, 99, 99, 7,3,4};
        System.out.println(sum67(myArr));
    }

    public static int sum67(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                for (int k = i + 1; k <arr.length; k++) {
                    if (arr[k] == 7) {
                        i = k;
                        break;
                    }
                }
            }
            else
                sum = sum + arr[i];
        }
        return sum;
    }
}