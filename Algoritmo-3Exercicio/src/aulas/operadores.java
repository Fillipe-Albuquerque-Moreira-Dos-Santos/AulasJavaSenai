package aulas;

import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		double f = 0;

		System.out.println("Infome a temperatura em graus Fahrenheit ");
		f = leia.nextInt();

		double c = 5 * (f-32) / 9;

		System.out.println("A temperatura do valor informado é graus celsius é de: " + c);

		leia.close();

	}

}