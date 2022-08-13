package entities;

public class Conta {

	private int numeroConta;
	private int agencia;
	private double saldo = 50.00;
	private Clientes titularDaConta;

	public Conta() {
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public Clientes getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(Clientes titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void Depositar(double valor) {
		this.saldo += valor;
	}

	public boolean Sacar(double valor) throws Exception {
		if (valor <= this.saldo) {
			this.saldo-= valor;
			return true;
		} else {
			throw new Exception("Saldo indisponível ");
		}
	}

	public boolean Transferir(double valor, Conta destino) throws Exception {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
		throw new Exception("Saldo indisponível ");
	}

}