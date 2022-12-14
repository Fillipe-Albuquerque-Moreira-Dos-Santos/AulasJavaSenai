package entities;

public class Carro {

	private int ano;
	private String modelo;
	private String cor;
	private String tipo;
	private String valor;
	private String situacao;
	private int carrovendido;
	private int carrodisponivel;

	public int getCarrovendido() {
		return carrovendido;
	}

	public void setCarrovendido(int carrovendido) {
		this.carrovendido = carrovendido;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Carro() {

	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) throws Exception {
		if (ano >= 2019) {
			this.ano = ano;
		}else {
			throw new Exception ("Não pode ser efetuado cadastro, carro com ano incompativel, so aceitamos carro com menos de 3 anos de uso");
		}
	
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCarrodisponivel() {
		return carrodisponivel;
	}

	public void setCarrodisponivel(int carrodisponivel) {
		this.carrodisponivel = carrodisponivel;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	
	public double ValorTotalEmEstoque() {
		return carrodisponivel -=carrovendido;
	}

	@Override
	public String toString() {

		return "Ano do carro: " + ano + "\nModelo do carro: " + modelo + "\nCor do carro: " + cor + "\nTipo do carro: "
				+ tipo + "\nValor do carro: " + valor + "\nSituação do carro: " + situacao
				+ "\nQuantidade de Carros Atualizado: " + ValorTotalEmEstoque();
	}

}
