package entities;

public class Moto extends Veiculo {
	
	public Moto() {

	}
	
	public Moto(String qtdpeneus, String motor, int qtdpassageiros, String combustivel) {
		
	}

	@Override
	public String toString() {
		return "O modelo da moto: " + getModelo()
				+"\nO tipo de Motor é: " + getMotor()
				+"\nA quatidade de pneus é: " + getQtdpneus()
				+ "\nA quatidade de passageiros da moto é: " + getQtdpassageiros()
				+ "\nO tipo de combusível é: " + getCombustivel();
			
	}

}
