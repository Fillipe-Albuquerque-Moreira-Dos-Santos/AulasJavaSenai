package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		String nome;
		int idade = 0;
		char sexo;
		double fortuna = 0;

		System.out.println("Informe o nome do usuário ");
		nome = leia.nextLine();

		System.out.println("Informe a idade");
		idade = leia.nextInt();

		System.out.println("Informe o sexo M = Masculino e F = Feminino");
		sexo = leia.next().charAt(0);
		
		System.out.println("Informe o saldo bancário");
		fortuna = leia.nextInt();

		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("O nome do usuário é " + nome + " a idade é " + idade + " anos " +  " o sexo é: " + sexo
				+ "  a fortuna é de: " + fortuna + "R$" + " no banco ");
		System.out.println("--------------------------------------------------------------------------------------");

		leia.close();

	}

}
