import java.util.Scanner;
public class Cie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
