package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSelecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Escolha um dia da semana");
		System.out.println("1 - Domingo");
		System.out.println("2 - Segunda");
		System.out.println("3 - Terca ");
		System.out.println("4 - Quarta");
		System.out.println("5 - Quinta");
		System.out.println("6 - Sexta");
		System.out.println("7 - Sábado");
		
		int numero = sc.nextInt();
		
		switch (numero) {
		
		case 1:
			System.out.println("Ótimo você escolheu Domingo");
		case 2:
			System.out.println("Ótimo você escolheu Segunda");
			break;
		case 3:
			System.out.println("Ótimo você escolheu Terça");
			break;
		case 4:
			System.out.println("Ótimo você escolheu Quarta");
			break;
		case 5:
			System.out.println("Ótimo você escolheu Quinta");
			break;
		case 6:
			System.out.println("Ótimo você escolheu Sexta");
			break;
		case 7:
			System.out.println("Ótimo você escolheu Sabado");
			break;
			default:
				System.out.println("Você digitou o dia da semana errado. Obrigado até a proxima");
				break;
		}
		System.out.println("Você saiu do programa");
		sc.close();
	}

}
