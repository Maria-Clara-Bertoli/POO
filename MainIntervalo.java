package POO;

import java.util.Scanner;

public class MainIntervalo {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Informe o primeiro número: ");
		int num1 = valor.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int num2 = valor.nextInt();
		
		Intervalo intervalo = new Intervalo(num1, num2);
		
		System.out.println(intervalo.MostraIntervalo());

	}

}
