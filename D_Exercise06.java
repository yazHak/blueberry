package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints true if the array contains 3 even or 3 odd values all next to each other.
Sample Output:
modThree([2, 1, 3, 5]); ->true
modThree([2, 1, 2, 5]); ->false
modThree([2, 4, 2, 5]); ->true
 */
public class D_Exercise06 {
    public static void main(String[] args) {
        int[]myArr={1,2,4,6};
        System.out.println(modThree(myArr));

    }
    public static boolean modThree(int [] arr) {
        boolean result=false;
        for (int i = 0; i < arr.length-2 ; i++) {
            //System.out.println(i+". loop, starting result before even test="+result);
            if(arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]==0) {
                result=true; break;
            }
            //System.out.println(i+". loop : arr["+i+"]="+arr[i]+" arr["+(i+1)+"]="+arr[i+1]+" arr["+(i+2)+"]="+arr[i+2]+" and ending result="+result );

            //System.out.println(i+". loop, starting result before odd test="+result);
            if (arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0) {
                result=true; break;
            }
            // System.out.println(i+". loop : arr["+i+"]="+arr[i]+" arr["+(i+1)+"]="+arr[i+1]+" arr["+(i+2)+"]="+arr[i+2]+" and ending result="+result );
        }
        return result;
    }
}
