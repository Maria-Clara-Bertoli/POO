package POO;

public class MainPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Maria", 19, 61.5f, 1.65f);
		Pessoa pessoa2 = new Pessoa("João", 22, 82.4f, 1.82f);
		
		System.out.println(pessoa1.getNome()); 
		pessoa1.Engordar();
		System.out.println("Engordar: " + pessoa1.getPeso());
		pessoa1.Crescer();
		System.out.println("Crescer: " + pessoa1.getAltura());
		pessoa1.Envelhecer();
		System.out.println("Envelhecer: " + pessoa1.getIdade());
		pessoa1.Emagrecer();
		System.out.println("Emagrecer: " + pessoa1.getPeso());
		System.out.println();
		System.out.println(pessoa2.getNome()); 
		pessoa2.Engordar();
		System.out.println("Engordar: " + pessoa2.getPeso());
		pessoa2.Crescer();
		System.out.println("Crescer: " + pessoa2.getAltura());
		pessoa2.Envelhecer();
		System.out.println("Envelhecer: " + pessoa2.getIdade());
		pessoa2.Emagrecer();
		System.out.println("Emagrecer: " + pessoa2.getPeso());
	}

}
