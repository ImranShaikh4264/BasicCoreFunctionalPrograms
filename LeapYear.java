package Day5;

public class LeapYear {
	public static void main(String[] args) {
        int year = 2020;
        if (year % 400 == 0) {
            System.out.println(" is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(" is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(" is a leap year.");
        } else {
            System.out.println(" is not a leap year.");
        }
        
    }
}
