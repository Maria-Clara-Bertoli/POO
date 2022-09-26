package POO;

public class Intervalo {
	
	private int numero1;
	private int numero2;
	
	public Intervalo(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public String MostraIntervalo(){
		int aux = 0;
		StringBuilder saida = new StringBuilder();
		if(getNumero1() > getNumero2() ) {
			System.out.println("A ordem dos números será alterada!");
			aux = getNumero1();
			setNumero1(getNumero2());
			setNumero2(aux);
		}
		int num1 = getNumero1();
		int num2 = getNumero2();
		for(;num1 <= num2; num1++) {
			saida.append(num1);
			saida.append(" ,");
		}
		return saida.toString();
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	@Override
	public String toString() {
		return "Intervalo [numero1=" + numero1 + ", numero2=" + numero2 + "]";
	}
}
