import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int median = (a > b)
                ? ((b > c) ? b : (a > c ? c : a))
                : ((a > c) ? a : (b > c ? c : b));

        System.out.println("Median = " + median);
    }
}
