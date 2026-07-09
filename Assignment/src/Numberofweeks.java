
public class Numberofweeks {
	public static void main(String[] args) {
		java.util.Scanner sc = new  java.util.Scanner(System.in);
		System.out.println("enter number of days");
		int n = sc.nextInt();
	int	weeks = n/7;
	int remaining = n%7;
	System.out.println("number of weeks"+weeks);
	System.out.println("remaing days"+remaining);
	}

}
