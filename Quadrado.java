package POO;

public class Quadrado {
	private float tamanho;
	
	public Quadrado(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public float getTamanho() {
		return this.tamanho;
	}
	
	public double calculaArea() {
		return Math.pow(getTamanho(), 2);
	}

	@Override
	public String toString() {
		return "Quadrado [tamanho=" + tamanho + "]";
	}
	
}
