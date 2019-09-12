package helloworld.ArrayAssignment;
/*
You and your date are trying to get a table at a restaurant. The parameter
"yourStyle" is the stylishness of your clothes, in the range 0..10, and
"dateStyle" is the stylishness of your date's clothes. The result getting
the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of
you is very stylish, 8 or more, then the result is 2 (yes). With the exception
that if either of you has style of 2 or less, then the result is 0 (no).
Otherwise the result is 1 (maybe).
Write a function that accepts yourStyle and dateStyle and prints the result
dateFashion(5, 10) → 2
dateFashion(5, 2) → 0
dateFashion(5, 5) → 1
 */
public class B_Question4 {
    public static void main(String[] args) {
        System.out.println(dateFashion(5,5));
    }
    public static int dateFashion(int yStyle, int dStyle) {
        int result=0;
        if((yStyle>=8 && dStyle>2) || (dStyle>=8 && yStyle>2)) {
            result=2;
        }
        else if(yStyle>2 && dStyle>2) {
            result=1;
        }
        return result;
    }
}
