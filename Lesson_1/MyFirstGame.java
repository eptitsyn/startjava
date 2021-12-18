public class MyFirstGame  {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int randomNumber = 100;

        int guess;
        int guessStep = 25;
        int nextGuess = 50;
        
        do {
            guess = nextGuess;
            System.out.print("Guess the number: ");
            System.out.println(guess);
            if (guess > randomNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                nextGuess = guess - guessStep;
            } else {
                System.out.println("Данное число меньше того, что загадал компьютер");
                nextGuess = guess + guessStep;
            }
            if (guessStep > 1) {
                guessStep /= 2;
            }
        } while (guess != randomNumber);
        System.out.println("Поздравляю, число угадано!");
    }
}