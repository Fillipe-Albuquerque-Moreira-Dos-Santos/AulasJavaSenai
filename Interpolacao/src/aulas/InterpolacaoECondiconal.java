package aulas;

import java.util.Locale;
import java.util.Scanner;

public class InterpolacaoECondiconal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double salario = 0.0;

		System.out.println("Informe o seu salário bruto");
		salario = sc.nextDouble();

		salario = salario + 0.05;
		salario = salario + 0.11;
		
		if (salario < 1200) {
			salario = salario + 0.5;
			System.out.println("O seu salário com todos os descontos é de: " + salario);
		}
		
		if (salario > 3500) {
			salario = salario + 0.2;
			System.out.println("O seu salário com todos os descontos é de: " + salario);
		}


		sc.close();

	}

}
