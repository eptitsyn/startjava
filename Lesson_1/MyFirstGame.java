public class MyFirstGame  {	
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int randomNum = 123;

        int guess = 0;
        while (guess != randomNum) {
            System.out.print("Guess the number:");
            guess = 42;
            if (guess == randomNum) { 
                System.out.println("Поздравляю, число угадано!");
            } else if (guess > randomNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
            }
        }
    }
}