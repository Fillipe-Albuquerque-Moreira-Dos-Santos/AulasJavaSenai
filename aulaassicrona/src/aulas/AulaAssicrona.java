package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AulaAssicrona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int LulaMolusculo = 0;
		int Bolso_Nelson = 0;
		int CiloucaGomes = 0;
		int BolosBolinho = 0;
		int voto = 0;

		do {
			System.out.println("Escolha para qual candidato irá seus votos");
			System.out.println("1 - Lula Molusculo");
			System.out.println("2 - Bolso Nleson");
			System.out.println("3 - Cilouca Gomes ");
			System.out.println("4 - Bolos Bolinho");
			System.out.println("0 - Selecione para sair do programa");
			voto = sc.nextInt();
		}

		while (voto >= 1 && voto <= 5);
		{

			if (voto == 1) {
				LulaMolusculo++;
				System.out.println(" Lula Molusculo recebeu " + LulaMolusculo);

			}

			if (voto == 2) {
				Bolso_Nelson++;
				System.out.println(" Bolso Nelson recebeu " + Bolso_Nelson);

			}

			if (voto == 3) {
				CiloucaGomes++;
				System.out.println(" Cilouca Gomes " + CiloucaGomes);

			}

			if (voto == 4) {
				BolosBolinho++;
				System.out.println(" Bolso Bolinho recebeu " + BolosBolinho);

			}

			if (voto == 5) {
				System.out.println("Você selecionou para finalizar");

			}
		}
		sc.close();

	}
}
