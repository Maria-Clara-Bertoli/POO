package POO;

import java.util.Scanner;

public class MainNomeSobrenome {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome = valor.nextLine();
		
		System.out.println("Informe o seu sobrenome: ");
		String sobrenome = valor.nextLine();
		
		NomeSobrenome nomesobrenome = new NomeSobrenome(nome, sobrenome);
		
		System.out.println(nomesobrenome.MostraNome()); 
		
		valor.close();

	}

}
