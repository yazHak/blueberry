package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints true if the sum of all 2's in the array is exactly 8
Sample Output:
sum28([2, 3, 2, 2, 4, 2]); - >true
sum28([2, 3, 2, 2, 4, 2, 2]); - >false
sum28([1, 2, 3, 4]); - >false
 */
public class D_Exercise01 {
    public static void main(String[] args) {
        int [] myArr = {2, 3, 2, 4};
        System.out.println(sum28(myArr));
    }
    public static boolean sum28(int [] arr) {
        boolean result = false;
        int sum=0;
        for (int num:arr
             ) {
            if(num==2) {
                sum=sum+num;
            }
        }
        if(sum==8){result=true;}
        return result;
    }
}
