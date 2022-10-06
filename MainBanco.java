package POO;

public class MainBanco {

	public static void main(String[] args) {
		
		Banco conta1 = new Banco();
		
		conta1.IncluirConta(543543, "Maria", 8326);
		System.out.println("Número Da Conta: " + conta1.getNumeroconta());
		System.out.println("Nome: " + conta1.getNome());
		System.out.println("Saldo: " + conta1.getSaldo());
		System.out.println("Depósito: " + conta1.Deposito(1000)); 
		System.out.println("Saque: " + conta1.Saque(500));

	}

}
