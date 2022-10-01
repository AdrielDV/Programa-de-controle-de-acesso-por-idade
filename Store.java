import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		int age = 0;
		boolean numero = true;
		do {
			try {
				Scanner scanner = new Scanner(System.in);
				age = scanner.nextInt();
				if (age <= 0) {
					System.out.println("Idade inválida");
				}

			} catch (Exception e) {
				System.out.println("Isso nao e uma idade ");
				numero = false;
			}
			if (age >= 18 && age <= 125) {
				System.out.println("Seja bem vindo! ");
			} else if (age <= 17 && age > 0 && numero == true) {
				System.out.println("Muito novo. Idade: " + age);
			} else {
				numero = true;
				System.out.println("Tente novamente.");

			}
		} // do

		while (age < 18 || numero == false || age>125);

	}

}