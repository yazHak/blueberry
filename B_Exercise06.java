package helloworld.ArrayAssignment;
/*
When chipmunks get together for a party, they like to have cigars.
A chipmunk party is successful when the number of cigars is between 40 and 60.
Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Write a function that accepts number of cigars and a boolean for weekend,
and prints true if the party with the given values is successful, or false otherwise.
cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
 */
public class B_Question6 {
    public static void main(String[] args) {
        System.out.println(cigarParty(25,true));
    }

    public static boolean cigarParty(int cigar, boolean weekEnd) {
        boolean weekEnd1 = false;
        if(weekEnd) {
            if(cigar>40) {weekEnd1=true;}
        }
        else {
            if(cigar>40 && cigar<60) weekEnd1=true;
        }
        return weekEnd1;
    }
}
