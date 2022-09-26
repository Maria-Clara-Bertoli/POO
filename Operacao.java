package POO;

public class Operacao {
	
	private double numero1;
	private double numero2;
	
	public Operacao (double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public double Multiplicacao(){
		double resultado = getNumero1() * getNumero2();
		return resultado;
	}
	
	public double Divisao(){
		double resultado = getNumero1() / getNumero2();
		return resultado;
	}
	
	public double Subtracao(){
		double resultado = getNumero1() - getNumero2();
		return resultado;
	}
	
	public double Adicao(){
		double resultado = getNumero1() + getNumero2();
		return resultado;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	@Override
	public String toString() {
		return "Operacao [numero1=" + numero1 + ", numero2=" + numero2 + "]";
	}
}
