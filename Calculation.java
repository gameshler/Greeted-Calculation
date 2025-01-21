import java.util.Scanner;

public class Calculation {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      // Ask for name
      System.out.print("Please enter your name: ");
      String name = scanner.nextLine();

      // Ask for age
      System.out.print("Please enter your age: ");
      int age = scanner.nextInt();

      // Ask for decimal number
      System.out.print("Please enter a decimal number: ");
      double decimalNumber = scanner.nextDouble();

      // Print greeting
      System.out.println("Hello, " + name + "! You are " + age + " years old.");

      // Square the decimal number
      double squaredNumber = Math.pow(decimalNumber, 2);

      // Print result
      System.out.println("The square of " + decimalNumber + " is: " + squaredNumber);

      scanner.close();

    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    }

  }
}
