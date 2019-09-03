package helloworld.ArrayAssignment;
/* ! ! ! UNSOLVED ! ! !
Write a function that accepts two arrays and prints how many of the arrays have 1 as their first Element
Sample Output:
start1([1,2,3],[1,3]); - >2
start1([7,2,3],[1]); - >1
start1([1,2],[]); - >1
start1([3,2,4],[4,3,4]); - >0
 */
public class C_Exercise02 {
    public static void main(String[] args) {
        int[] myArr1 = {1,2,3}; int[] myArr2 = {1,3};
        int[] myArr3 = {7,2,3}; int[] myArr4 = {1};
        int[] myArr5 = {1,2}; int[] myArr6 = {0};
        int[] myArr7 = {3,2,4}; int[] myArr8 = {4,3,4};

        start1(myArr1, myArr2);
        start1(myArr3, myArr4);
        start1(myArr5, myArr6);
        start1(myArr7, myArr8);
    }
    public static void start1(int[] arr1, int[] arr2) {

        try {
            int n1 = arr1[0];
            int n2 = arr2[0];

            if((n1==1 && n2!=1) || (n1!=1 && n2==1)) System.out.println("--> 1");
            else if(n1==1 && n2==1) System.out.println("--> 2");
            else System.out.println("--> 0");
        }
        catch (Exception e) {
            System.out.println("--> 0");
        }
    }
}
