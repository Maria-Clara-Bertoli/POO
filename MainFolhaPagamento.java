package POO;

import java.util.Scanner;

public class MainFolhaPagamento {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner (System.in);
		
		System.out.println("Informe o valor por hora: ");
		double dinheiro = valor.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
		int hora = valor.nextInt();
		
		FolhaPagamento folha = new FolhaPagamento(dinheiro, hora);
		
		System.out.println("-------------------");
		System.out.println("FOLHA DE PAGAMENTO");
		System.out.println("-------------------");
		System.out.println("Salário Bruto: " + folha.SalarioBruto());
		System.out.println("Desconto INSS: " + folha.DescontoINSS());
		System.out.println("Desconto IR: " + folha.DescontoIR());
		System.out.println("Desconto Sindicato: " + folha.DescontoSindicato());
		System.out.println("Salário Líquido: " + folha.SalarioLiquido());

	}

}
