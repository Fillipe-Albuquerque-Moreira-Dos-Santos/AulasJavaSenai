package Program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Cliente;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		Carro carro;
		Cliente cliente;
		/*
		 * Cliente cliente = new Cliente(); Carro carro = new Carro();
		 */
		ArrayList<Carro> carros = new ArrayList<>();
		char opt;
		System.out.println("Deseja cadastrar um veiculo?(s/n): ");
		opt = sc.next().charAt(0);

		while (Character.toLowerCase(opt) == 's') {

			// Dados referentes ao cliente
			try {
				carro = new Carro();
				cliente = new Cliente();
				sc.nextLine();

				System.out.print("Entre com o Nome do Cliente: ");
				cliente.setNome(sc.nextLine());

				System.out.print("Entre com o CPF do cliente: ");
				cliente.setCpf(sc.nextLine());

				System.out.print("Entre com o telefone do Cliente: ");
				cliente.setTelefone(sc.nextLine());

				System.out.print("Entre com o endereço do Cliente: ");
				cliente.setEndereco(sc.nextLine());

				// -------------------------------------------------------------------------------

				// Dados referentes ao carro

				System.out.println("\nEntre com o ano do carro: ");
				carro.setAno(sc.nextInt());

				sc.nextLine();
				System.out.println("Entre com o modelo do carro (caminhonete, hatch, sedan..) ");
				carro.setModelo(sc.nextLine());

				System.out.println("Entre com a cor do carro: ");
				carro.setCor(sc.nextLine());

				System.out.println("Entre com o tipo do carro: ");
				carro.setTipo(sc.nextLine());

				System.out.println("Entre com o valor do carro: ");
				carro.setValor(sc.nextLine());
				System.out.println("O carro é novo ou usado? ");
				carro.setSituacao(sc.nextLine());

				System.out.println("Informe quantos carros você tem disponíveis: ");
				carro.setCarrodisponivel(sc.nextInt());

				System.out.println("Informe quantos carros você quer vender: ");
				carro.setCarrovendido(sc.nextInt());

				System.out.println("\nDados referentes ao cliente");
				System.out.println(cliente);
				System.out.println("\nDados referentes ao carro");
				//System.out.println(carro);
				carros.add(carro);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("Deseja cadastrar um veiculo?(s/n): ");
			opt = sc.next().charAt(0);

		}
		for (Carro listaCarro : Carros) {
			System.out.println(listaCarro);
		}
		System.out.println("Ok! Não quer cadastrar tudo certo. Manda um abraço pra galera do Whasapp");

		 sc.close();

	}
}
