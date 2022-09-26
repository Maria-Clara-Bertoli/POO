package POO;

public class FolhaPagamento {
	
	private double dinheiro;
	private int hora;
	
	public FolhaPagamento(double dinheiro, int hora) {
		this.dinheiro = dinheiro;
		this.hora = hora;
	}
	
	public double SalarioBruto() {
		return getDinheiro() * getHora();
	}
	
	public double DescontoINSS() {
		double salariobruto = SalarioBruto();
		double desconto = (salariobruto/100) * 8;
		return desconto;
	}
	
	public double DescontoIR() {
		double salariobruto = SalarioBruto();
		double desconto = (salariobruto/100) * 11;
		return desconto;
	}
	
	public double DescontoSindicato() {
		double salariobruto = SalarioBruto();
		double desconto = (salariobruto/100) * 5;
		return desconto;
	}
	
	public double SalarioLiquido() {
		double salariobruto = SalarioBruto();
		double inss = DescontoINSS();
		double ir = DescontoIR();
		double sindicato = DescontoSindicato();
		
		return (((salariobruto - inss) - ir) - sindicato);
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "FolhaPagamento [dinheiro=" + dinheiro + ", hora=" + hora + "]";
	}
}
