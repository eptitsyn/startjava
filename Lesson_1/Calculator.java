public class Calculator  {	
    public static void main(String[] args) {
        System.out.print("Enter first operand:");
        int a = 2;
        System.out.print("Enter operation:");
        char op = '^';
        System.out.print("Enter second operand:");
        int b = 3;

        double result = 0;
        if (op == '+') {
            result = a + b;
        } else if (op == '-'){
            result = a - b;
        } else if (op == '*'){
            result = a * b;
        } else if (op == '/'){
            result = a / b;
        } else if (op == '%'){
            result = a % b;
        } else if (op == '^'){
            result = 1;
            for(int i = 0; i < b; i++){
                result *= a;
            }
        }
        System.out.println("Result = " + result);
    }
}