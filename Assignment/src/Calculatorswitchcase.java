import java.nio.file.spi.FileSystemProvider;

public class Calculatorswitchcase {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("enter a character(+,-,*,/,%");
		int ch=sc.next().charAt(0);
		switch(ch) {
		case'+':
			System.out.println("result is"+(a+b));
			break;
		case'-':
			System.out.println("result is"+(a-b));
			break;
		case'*':
			System.out.println("result is"+(a*b));
			break;
		case'/':
			System.out.println("result is"+(a/b));
			break;
		case'%':
			System.out.println("result is"+(a%b));
			break;
		default:
			System.out.println("invalid character");
			
		  
		}
		sc.close();
	}

}
