import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String continueAnswer = "yes";
        while (continueAnswer.equals("yes")) {
            System.out.print("Enter first operand:");
            calculator.setOperandOne(Integer.parseInt(scanner.nextLine()));
            System.out.print("Enter operation:");
            calculator.setMathOperation(scanner.nextLine().charAt(0));
            System.out.print("Enter second operand:");
            calculator.setOperandTwo(Integer.parseInt(scanner.nextLine()));
            System.out.println("Результат " + calculator.calculate());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                continueAnswer = scanner.nextLine();
                if (continueAnswer.equals("no")) {
                    return;
                }
            } while (!continueAnswer.equals("yes"));
        }
    }
}