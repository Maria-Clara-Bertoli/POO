package POO;

public class NomeSobrenome {
	
	private String nome;
	private String sobrenome;
	
	public NomeSobrenome(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String MostraNome(){
		StringBuilder saida = new StringBuilder();
		saida.append(getNome());
		saida.append(" " + getSobrenome());
		return saida.toString();
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "NomeSobrenome [nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
}
