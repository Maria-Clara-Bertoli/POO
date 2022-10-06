package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCardapio {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		boolean pedido = true;
		ArrayList <Integer> listcodigo = new ArrayList <Integer> ();
		ArrayList <Integer> listquantidade = new ArrayList <Integer> ();
		ArrayList <Float> listcalculapreco = new ArrayList <Float> ();
		ArrayList <String> listnome = new ArrayList <String> ();
		
		System.out.println("------------CARDÁPIO------------");
		System.out.println("100 - Cachorro Quente - R$ 1,20");
		System.out.println("101 - Bauru Simples - R$ 1,30");
		System.out.println("102 - Bauru Com Ovo - R$ 1,50");
		System.out.println("103 - Hambúrguer - R$ 1,20");
		System.out.println("104 - Cheesebúrguer - R$ 1,30");
		System.out.println("105 - Refrigerante - R$ 1,00");
		
		System.out.println("");
		System.out.println("De acordo com o cardápio informe o código do produto que você deseja e posteriormente a quantidade: ");
		System.out.println("");
		do {
			System.out.println("Código: ");
			int codigo = valor.nextInt();
			System.out.println("Quantidade: ");
			int quantidade = valor.nextInt();
			
			if(codigo == 100) {
				listnome.add("Cachorro Quente");
			}
			else if(codigo == 101){
				listnome.add("Bauru Simples");
			}
			else if(codigo == 102){
				listnome.add("Bauru Com Ovo");
			}
			else if(codigo == 103){
				listnome.add("Hambúrguer");
			}
			else if(codigo == 104){
				listnome.add("Cheesebúrguer");
			}
			else if(codigo == 105){
				listnome.add("Refrigerante");
			}
			
			listcodigo.add(codigo);
			listquantidade.add(quantidade);
			valor.nextLine();
			System.out.println("Deseja encerrar o pedido? Digite S/N ");
			String simounao = valor.nextLine();
			
			if(simounao.equalsIgnoreCase("S")) {
				pedido = false;
			}
		}while(pedido == true);
		
		Cardapio cardapio = new Cardapio(listquantidade, listcodigo, listnome);
		
		listcalculapreco = new ArrayList(cardapio.CalculaPreco());
		
		System.out.println("-----------------------------------PEDIDO-----------------------------------");
		for(int i = 0; i < listcodigo.size(); i++) {
			System.out.println(cardapio.getListcodigo().get(i) + " - " + cardapio.getListNome().get(i) + " - Total: R$" + listcalculapreco.get(i));
		}
		System.out.println("TOTAL GERAL: R$" + cardapio.Soma());
	}
}
