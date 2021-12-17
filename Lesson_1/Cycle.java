public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int i = -6;
        while (i <= 6) {
            System.out.println(i);
            i += 2;
        }

        int sumOdd = 0;
        i = 10;
        do {
            if(i % 2 != 0) {
                sumOdd += i;
            }
            i++;
        } while (i <= 20);
        System.out.println("sum odd of [10, 20] = " + sumOdd);
    }
}