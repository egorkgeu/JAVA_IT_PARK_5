import java.util.Scanner;

class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int Sum = 0;
							System.out.print("Введите любое целое число: ");
							int n = scanner.nextInt();
							System.out.print("Введите диапазон значений a и b (число a не может быть больше числа b): ");
							System.out.println();
							System.out.print("Введите число а: ");
							int a = scanner.nextInt();
							System.out.print("Введите число b: ");
							int b = scanner.nextInt();
							if(a > b){
								System.out.println("Error. Число a не может быть больше числа b");
								return;
							}
							    for (int i = 1; i <= n; i++) {
								int random_number = a + (int) (Math.random() * b);
							    System.out.println(i + " - Случайное число: " + random_number);
								Sum+=random_number;
							}
							System.out.println("Сумма случайных чисел: " + Sum);
		
	}
}