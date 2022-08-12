package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Moto moto = new Moto();
		Carro carro = new Carro();
		Veiculo veiculo = new Veiculo();
		ArrayList<Carro> carros = new ArrayList<>();

		char opt;
		System.out.println("Deseja cadastrar um veiculo?(s/n): ");
		opt = sc.next().charAt(0);

		while (Character.toLowerCase(opt) == 's') {

			// DADOS DO VÉICULO
			sc.nextLine();
			System.out.println("Informe o Modelo do Véiculo: ");
			veiculo.setModelo(sc.nextLine());
			System.out.println("Informe o Tipo de Motor do Véiculo: ");
			veiculo.setMotor(sc.nextLine());
			System.out.println("Informe a quatidade de penus: ");
			veiculo.setQtdpneus(sc.nextLine());
			System.out.println("Informe a quantidade de passageiros: ");
			veiculo.setQtdpassageiros(sc.nextInt());
			sc.hasNextLine();
			System.out.println("Informe o tipo de combustivel do carro: ");
			veiculo.setCombustivel(sc.nextLine());
			sc.nextLine();

			System.out.println("\n---------\n");

			// DADOS MOTO
			System.out.println("Informe o Modelo da Moto: ");
			moto.setModelo(sc.nextLine());
			System.out.println("Informe o motor da moto: ");
			moto.setMotor(sc.nextLine());
			System.out.println("Informe a quantidade de Pneus da moto: ");
			moto.setQtdpneus(sc.nextLine());
			System.out.println("Informe a Quantidade de passageiros da moto: ");
			moto.setQtdpassageiros(sc.nextInt());
			sc.nextLine();
			System.out.println("Informe o tipod e combustivel da moto");
			moto.setCombustivel(sc.nextLine());
			System.out.println("\nINFORMAÇÕES VEÍCULO");
			System.out.println(veiculo);
			System.out.println("\n");
			System.out.println("INFORMAÇÕES MOTO");
			System.out.println(moto);
			carros.add(carro);

			System.out.println("Deseja cadastrar um veiculo?(s/n): ");
			opt = sc.next().charAt(0);

		}

		for (Carro listaCarro : carros) {
			System.out.println(listaCarro);
		}
		System.out.println("Ok! Até logo.");

		sc.close();
	}

}
