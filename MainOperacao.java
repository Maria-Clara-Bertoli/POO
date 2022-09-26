package POO;

import java.util.Scanner;

public class MainOperacao {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double num1 = valor.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		double num2 = valor.nextDouble();
		
		Operacao operacao = new Operacao(num1, num2);
		
		System.out.println("Multiplicação: " + operacao.Multiplicacao());
		System.out.println("Divisão: " + operacao.Divisao());
		System.out.println("Adição: " + operacao.Adicao());
		System.out.println("Subtração: " + operacao.Subtracao());

	}

}
