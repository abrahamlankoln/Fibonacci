import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3, counter;
		Scanner deger = new Scanner(System.in);
		System.out.print("lutfen fibonacci basamak sayisini giriniz: ");
		counter=deger.nextInt();
		
		System.out.print(num1 + " " + num2);

		for (int i = 1; i < counter; ++i) {
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
