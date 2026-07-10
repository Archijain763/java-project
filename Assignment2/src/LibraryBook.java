import java.util.Scanner;

 public class LibraryBook {
    private String bookName;
    private int daysLate;
    private double finePerDay;

    // Setters
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }

    public void setFinePerDay(double finePerDay) {
        this.finePerDay = finePerDay;
    }

    // Getters
    public String getBookName() {
        return bookName;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public double getFinePerDay() {
        return finePerDay;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryBook book = new LibraryBook();

        System.out.print("Enter Book Name: ");
        book.setBookName(sc.nextLine());

        System.out.print("Enter Days Late: ");
        book.setDaysLate(sc.nextInt());

        System.out.print("Enter Fine Per Day: ");
        book.setFinePerDay(sc.nextDouble());

        double totalFine = book.getDaysLate() * book.getFinePerDay();

        // Extra fine if late for more than 10 days
        if (book.getDaysLate() > 10) {
            totalFine += 100;
        }

        System.out.println("\nBook Name: " + book.getBookName());
        System.out.println("Days Late: " + book.getDaysLate());
        System.out.println("Total Fine: " + totalFine);
    }
}