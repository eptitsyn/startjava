public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		for (int i = -6; i <= 6; i += 2) {
			System.out.println(i);
		}
		int sum = 0;
		int i = 10;
		do {
			if(!(i % 2 == 0)) {
				sum += i;
			}
			i++;
		} while (i <= 20);
		System.out.println("sum odd of [10, 20] = " + i);
	}
}