import java.util.Scanner;

public class CalculatorTest  {	
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first operand:");
            calculator.setOperandOne(Integer.parseInt(scanner.nextLine()));
            System.out.print("Enter operation:");
            calculator.setMathOperation(scanner.nextLine().charAt(0));
            System.out.print("Enter second operand:");
            calculator.setOperandTwo(Integer.parseInt(scanner.nextLine()));

            System.out.println("Результат " + calculator.calculate());

            boolean continueAnswerOk = false;
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                switch (scanner.nextLine()){
                    case "yes":
                    continueAnswerOk = true;
                        break;
                    case "no":
                        return;
                }
            } while (!continueAnswerOk);
        }
    }
}