package entities;

public class Veiculo {
	
	private String qtdpneus;
	private String motor;
	private int qtdpassageiros;
	private String combustivel;
	private String modelo;
	
	
	public Veiculo() {
		
	}
	
	public Veiculo(String qtdpeneus, String motor, int qtdpassageiros, String combustivel, String modelo) {
		
		this.qtdpneus = qtdpeneus;
		this.motor = motor;
		this.qtdpassageiros = qtdpassageiros;
		this.combustivel = combustivel;
		this.modelo = modelo;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getQtdpneus() {
		return qtdpneus;
	}
	public void setQtdpneus(String qtdpneus) {
		this.qtdpneus = qtdpneus;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getQtdpassageiros() {
		return qtdpassageiros;
	}
	public void setQtdpassageiros(int qtdpassageiros) {
		this.qtdpassageiros = qtdpassageiros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	@Override
	public String toString() {
		return "O modelo é Veículo: " + modelo
				+"\nO tipo de Motor é: " + motor
				+"\nA quatidade de pneus é: " + qtdpneus
				+ "\nA quatidade de passageiros do veículo é: " + qtdpassageiros
				+ "\nO tipo de combusível é: " + combustivel;
			
	}
}
