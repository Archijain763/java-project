
public class Swapwithvariable {
public static void main(String[] args) {
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int temp;
	System.out.println("enter first number");
	int a = sc.nextInt();
	System.out.println("enter second number");
	int b = sc.nextInt();
	temp = a;
	a = b;
	b = temp;
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	
}
}
