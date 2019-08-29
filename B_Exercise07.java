package helloworld.ArrayAssignment;
/*
Write a function that accepts an array and prints true if the first instance of "x" in the array is immediately
followed by another "x". if array does not have "x", print "not found"
doubleX(["a","x","x","b","b"]) → true
doubleX(["a","x","a","x","a","x"]) → false
doubleX(["x","x","x","x","x"]) → true
doubleX(["a","a"]); -> not found
 */
public class B_Exercise07 {
    public static void main(String[] args) {
        String [] myArr = {"a","x","x","b","b"};
        String [] myArr2 = {"a","x","a","x","a","x"};
        String [] myArr3 = {"x","x","x","x","x"};
        String [] myArr4 = {"a","a"};

        doubleX(myArr);
        doubleX(myArr2);
        doubleX(myArr3);
        doubleX(myArr4);
    }

    public static void doubleX(String[] arr) {
        boolean result=false;
        for (String str:arr
             ) {
            if(str.equalsIgnoreCase("x")) result=true;
        }
        if(!result) System.out.println("Not found");
        else {
            result=false;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i].equalsIgnoreCase("x") && arr[i+1].equalsIgnoreCase("x")) {
                    result=true; break;
                }
            }
            System.out.println(result);
        }
    }
}
