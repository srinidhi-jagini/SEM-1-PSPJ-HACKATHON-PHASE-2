import java.util.Scanner;

public class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        } else {
            return 0;
        }
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("\nCINEMA BOOKING BILL");
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: Rs. %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount: Rs. %.2f%n", calculateTotal());
        System.out.printf("Discount: Rs. %.2f%n", calculateDiscount());
        System.out.printf("Final Amount: Rs. %.2f%n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String name = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        MovieTicket booking = new MovieTicket(name, price, tickets);
        booking.displayBill();

        sc.close();
    }
}