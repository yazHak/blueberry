package helloworld.ArrayAssignment;
/*
Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
write a function that accepts the indexOfDay and isVacation and prints a string of the form "7:00" indicating
when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
alarmClock(1, false); ->"7:00"
alarmClock(5, false); ->"7:00"
alarmClock(0, false); ->"10:00"
alarmClock(2,true); ->"10:00"
 */
public class B_Exercise10 {
    public static void main(String[] args) {
        alarmClock(1,false);
        alarmClock(5,false);
        alarmClock(0,false);
        alarmClock(2,true);
    }
    public static void alarmClock(int indexOfDay, boolean isVacation) {
        if(isVacation) {
            if(indexOfDay!=0 && indexOfDay!=6) {
                System.out.println("--> \"10:00\"");
            }
            else System.out.println("OFF");
        }
        else {
            if(indexOfDay!=0 && indexOfDay!=6) {
                System.out.println("--> \" 7:00\"");
            }
            else System.out.println("--> \"10:00\"");
        }
    }
}
