package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.viloes;

public class Herois {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Entre com o universo do Heroi: ");
		String  universoHeroi = sc.nextLine();
		
		System.out.print("Entre com o nome do Heroi: ");
		String  nomeHeroi = sc.nextLine();
		
		System.out.print("Informe o Planeta Natal do Heroi: ");
		String  planetaNatal = sc.nextLine();
		
		System.out.print("Informe  cida de Natal: ");
		String  cidadeNatal = sc.nextLine();
		
		System.out.print("Informe a Base Secreta: ");
		String  baseScreta = sc.nextLine();
		
		System.out.print("Informe o tipo de super poder do Heroi: ");
		String  poder = sc.nextLine();
		
		System.out.print("Informe a idade: ");
		int  idade = sc.nextInt();
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
