package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints true if the array contains 2 twice or 3 twice.
Sample Output:
double23([2,2]); - >true
double23([3,3]); - >true
double23([2,3]); - >false
double23([12,20,42]); - >false
double23([2,2,2]); - >false
 */

import java.util.HashMap;

public class A_Question10 {
    public static void main(String[] args) {
        int[] myArr1 = {2,2};
        int[] myArr2 = {3,3};
        int[] myArr3 = {12,20,42};
        findTwices(myArr1);
        findTwices(myArr3);

    }
    public static void findTwices(int [] arr) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int n:arr
             ) {
            if(counts.containsKey(n)) counts.put(n,counts.get(n)+1);
            else counts.put(n,1);
        }
        System.out.println(counts);

        if(counts.containsValue(2) || counts.containsValue(3)) {
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
