package POO;

import java.util.Scanner;

public class MainOperacao {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		double num1 = valor.nextDouble();
		
		System.out.println("Informe o segundo n�mero: ");
		double num2 = valor.nextDouble();
		
		Operacao operacao = new Operacao(num1, num2);
		
		System.out.println("Multiplica��o: " + operacao.Multiplicacao());
		System.out.println("Divis�o: " + operacao.Divisao());
		System.out.println("Adi��o: " + operacao.Adicao());
		System.out.println("Subtra��o: " + operacao.Subtracao());

	}

}
