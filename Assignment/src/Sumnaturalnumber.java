
public class Sumnaturalnumber {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int sum=0;
		System.out.println("enter a number");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
		  sum=sum+i;
		  if(i<n) {
			  System.out.print(i+"+");
		  }else {
			 System.out.print(i);
		 }
		  }
		System.out.println("=" + sum);
	}
}


