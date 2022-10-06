package POO;

public class BombaCombustivel {
	
	private int tipocombustivel;
	private float valorlitro;
	private float quantidadecombustivel;
	
	public BombaCombustivel(int tipocombustivel, float valorlitro, float quantidadecombustivel) {
		this.tipocombustivel = tipocombustivel;
		this.valorlitro = valorlitro;
		this.quantidadecombustivel = quantidadecombustivel;
	}
	
	public float AbastecerPorValor(float valor) {
		float quantidade = valor/getValorlitro();
		return quantidade;
	}
	
	public float AbastecerPorLitro(float litro) {
		float pagamento = litro * getValorlitro();
		return pagamento;
	}
	
	public void AlteraValor(float valor) {
		setValorlitro(valor);
	}
	
	public void AlteraCombustivel(int tipo) {
		setTipocombustivel(tipo);
	}

	public int getTipocombustivel() {
		return tipocombustivel;
	}

	public void setTipocombustivel(int tipocombustivel) {
		this.tipocombustivel = tipocombustivel;
	}

	public float getValorlitro() {
		return valorlitro;
	}

	public void setValorlitro(float valorlitro) {
		this.valorlitro = valorlitro;
	}

	public float getQuantidadecombustivel() {
		return quantidadecombustivel;
	}

	public void setQuantidadecombustivel(float quantidadecombustivel) {
		this.quantidadecombustivel = quantidadecombustivel;
	}

	@Override
	public String toString() {
		return "BombaCombustivel [tipocombustivel=" + tipocombustivel + ", valorlitro=" + valorlitro
				+ ", quantidadecombustivel=" + quantidadecombustivel + "]";
	}
}
