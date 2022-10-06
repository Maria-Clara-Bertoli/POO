package POO;

import java.util.Scanner;

public class MainQuadrado {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Informe o valor do lado do quadrado: ");
		float lado = valor.nextFloat();
		
		Quadrado quadrado = new Quadrado(lado);
		
		System.out.println("Muda o valor do lado:"); 
		quadrado.setTamanho(lado);
		
		System.out.println("Retorna o valor do lado:");
		quadrado.getTamanho();
		
		System.out.println("Calcula a área:");
		quadrado.calculaArea();
		
		System.out.println("Área calculada: " + quadrado.calculaArea());
	}

}
