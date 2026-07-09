
public class Swapwithoutvariable {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		a = a+b;
		b=a-b;
		a = a-b;
		System.out.println("after swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
