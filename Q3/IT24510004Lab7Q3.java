import java.util.Scanner;

public class IT24510004Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBill, discount, amountToBePaid;
        char paymentMode;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            totalBill = input.nextDouble();
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = input.next().charAt(0);
            
            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = totalBill * 0.05;
                amountToBePaid = totalBill - discount;
                System.out.println("Discount: " + discount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                amountToBePaid = totalBill;
                System.out.println("No discount applicable.");
            } else {
                System.out.println("Payment Mode is Not Valid");
                continue; // Skip to the next customer
            }
            
            System.out.println("Amount to be paid: " + amountToBePaid);
            System.out.println();
        }
        
        input.close();
    }
}
