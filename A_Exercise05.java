package helloworld.ArrayAssignment;

public class A_Question5 {
    public static void main(String[] args) {
        int [] myArr = {1,2,3,4,5};
        rotateArray(myArr);
    }

    public static void rotateArray(int [] arr) {
        int newArr [] = new int[arr.length];
        newArr[arr.length-1]=arr[0];
        for(int i=0; i<arr.length-1; i++) {
            newArr[i]=arr[i+1];
        }
        for (int number:arr
        ) {
            System.out.print(number+" ");
        }
        System.out.println();
        for (int number:newArr
             ) {
            System.out.print(number+" ");
        }
    }
}
