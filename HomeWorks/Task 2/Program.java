import java.util.Scanner;

class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
	    while (true){
			System.out.println("MENU:");
			System.out.println("1. Show in range:");
			System.out.println("2. Sum of numbers:");
			System.out.println("3. Sum of digits:");
			System.out.println("4. Exit:");
		    int command = scanner.nextInt();
			if(command > 4){
				System.out.println("Раздела под данным номером не существует!!!");
				return;
			}
		    switch (command) {
			            case 1: {
							System.out.print("Введите два любых целых числа: ");
							System.out.println();
							System.out.print("Введите первое число: ");
					        int i = scanner.nextInt();
							System.out.print("Введите второе число: ");
		                    int j = scanner.nextInt();
							System.out.println("Четные числа в заданном диапазоне:");
				                if(i<=j){
					                for (;i<=j ;i++) {
						                if (i%2==0) {
							            System.out.println(i);			
						                }
					                }
				                } 
				                else {
					                for (; i>=j ; i--) {
						               if (i%2==0) {
							           System.out.println(i);
						               }
						
					                }   
				                }
				        break;
	                    }
		                case 2: {
							int Sum = 0;
							System.out.print("Введите любое целое число: ");
							int n = scanner.nextInt();
							for (int i = 1; i <= n; i++) {
							    System.out.print(i + " - случайное число: ");
							    int a = scanner.nextInt();
							    Sum+=a;
							}
							System.out.println("Сумма случайных чисел: " + Sum);
							break;
						}
			            case 3: {
						   int Sum = 0;
						   System.out.print("Введите любое число: ");	
						   int n = scanner.nextInt();	
						   System.out.print("Сумма цифр введенного случайного числа: ");
							   for(; n != 0; n /= 10){ 
                                  Sum += (n % 10); 
                               }  
                           System.out.println(Sum);
						   break;
                        }
                        default: {
					       System.exit(4);
					       break; 
				        }					
		    }
		}	
	}
} 

					    