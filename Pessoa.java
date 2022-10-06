package POO;

public class Pessoa {
	
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public Pessoa(String nome, int idade, float peso, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void Crescer() {
		if(idade < 21) {
			float crescer = (float)(getAltura() + 0.5);
			setAltura(crescer);
			setIdade(getIdade() + 1);
		}
	}
	
	public void Engordar() {
		float engordar = (float)(getPeso() + 1);
		setPeso(engordar);
	}
	
	public void Emagrecer() {
		float engordar = (float)(getPeso() - 1);
		setPeso(engordar);
	}
	
	public void Envelhecer() {
		if(idade < 21) {
			Crescer();
		}
		else {
			setIdade(getIdade() + 1);
		}
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
	}
}
