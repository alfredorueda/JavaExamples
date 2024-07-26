import java.util.Scanner;

public class ATM {
    private static final String CORRECT_PIN = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enteredPin;
        boolean isPinCorrect = false;

        do {
            System.out.print("Please enter your ATM pin: ");
            enteredPin = scanner.nextLine();
            if (enteredPin.equals(CORRECT_PIN)) {
                isPinCorrect = true;
            } else {
                System.out.println("Incorrect pin. Please try again.");
            }
        } while (!isPinCorrect);

        System.out.println("Pin accepted. You can now access your account.");
    }
}
