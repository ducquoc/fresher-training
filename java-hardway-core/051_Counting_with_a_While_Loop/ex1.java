import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();

        int n = 0;
        while (n < 5) {
            System.out.println((n + 1) + ". " + message);
            // What does n++ do? Remove it and see what happens. (Then put it back.)
            // n++;
        }

    }
}
