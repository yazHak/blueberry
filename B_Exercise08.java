package helloworld.ArrayAssignment;
/*
The deers in VA spend most of the day playing. In particular, they play if the temperature is between 60 and 90.
Unless it is summer, then the upper limit is 100 instead of 90.
Write a function that accepts temperature and a boolean isSummer, prints true if the deers play and false otherwise.
squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true
 */
public class B_Exercise08 {
    public static void main(String[] args) {
        System.out.println(squirrelPlay(70,false));
        System.out.println(squirrelPlay(95,false));
        System.out.println(squirrelPlay(95,true));
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        boolean result = false;
        if(isSummer && temp>60 && temp<100) result=true;
        else if(!isSummer && temp>60 && temp<90) result=true;
        return result;
    }
}
