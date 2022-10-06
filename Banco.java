package POO;

public class Banco {
	
	private int numeroconta;
	private String nome;
	private double saldo;
	
	public Banco() {
		this.numeroconta = 0;
		this.nome = "";
		this.saldo = 0;
	}
	
	public void IncluirConta(int numeroconta, String nome, double saldo) {
		setNumeroconta(numeroconta);
		setNome(nome);
		setSaldo(saldo);
	}
	
	public void AlterarNome(String nome) {
		setNome(nome);
	}
	
	public double Deposito(double valor) {
		setSaldo(getSaldo() + valor);
		return getSaldo();
	}

	public double Saque(double valor) {
		setSaldo(getSaldo() - valor);
		return getSaldo();
	}
	
	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Banco [numeroconta=" + numeroconta + ", nome=" + nome + ", saldo=" + saldo + "]";
	}
}
