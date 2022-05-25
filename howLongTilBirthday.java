//This algorithm will tell you how many days are left until your next birthday.
import java.util.Scanner;
public class howLongTilBirthday {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean isLeapYear = false;
		boolean hadBirthday = false;
		
		System.out.print("Have you had a birthday yet this year? ");
		String str = input.nextLine();
		if (str.equalsIgnoreCase("yes")) {
			hadBirthday = true;
		}
		
		System.out.print("\nIs it a leap year? ");
		str = input.nextLine();
		if (str.equalsIgnoreCase("yes")) {
			hadBirthday = true;
		}
		
		System.out.print("\nWhat month is it? ");
			int curMonth = input.nextInt();
		System.out.print("\nWhat day is it? ");
			int curDay = input.nextInt();
			
		System.out.print("\nWhat month were your born? ");
			int birMonth = input.nextInt();
		System.out.print("\nWhat day of the month were you born? ");
			int birDay = input.nextInt();	
			
		int daysLeft = 0;
		
		if (hadBirthday == true) {
			while (curMonth != birMonth) {
				if (curMonth == 13) {
					curMonth = 1;
				}
				if (curMonth == 1 || curMonth == 3 || curMonth == 5 || curMonth == 7 || curMonth == 8 || curMonth == 10 || curMonth == 12) {
					daysLeft+= 31;
				}
				
				if (curMonth == 4 || curMonth == 6 || curMonth ==  9 || curMonth == 11) {
					daysLeft+= 30;
				}
				
	
				if (curMonth == 2) {
					if (isLeapYear == true) {
						daysLeft+= 29;
					}
					else {
						daysLeft+= 28;
					}
				}
				curMonth++;
			}
		}
		else {
			while (birMonth > curMonth) {
				if (curMonth == 1 || curMonth == 3 || curMonth == 5 || curMonth == 7 || curMonth == 8 || curMonth == 10 || curMonth == 12) {
					daysLeft+= 31;
				}
				
				if (curMonth == 4 || curMonth == 6 || curMonth ==  9 || curMonth == 11) {
					daysLeft+= 30;
				}
				
	
				if (curMonth == 2) {
					if (isLeapYear == true) {
						daysLeft+= 29;
					}
					else {
						daysLeft+= 28;
					}
				}
				curMonth++;
			}
		}
		daysLeft += (birDay - curDay);
		System.out.println("Your birthday is in " + daysLeft + " days.");
		input.close();
	}
}
