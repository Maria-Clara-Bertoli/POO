package POO;

import java.util.ArrayList;

public class Cardapio {
	
	private ArrayList <Integer> listquantidade = new ArrayList <Integer>();
	private ArrayList <Integer> listcodigo = new ArrayList <Integer>();
	private ArrayList <Float> listpreco = new ArrayList <Float>();
	private ArrayList <String> listnome = new ArrayList <String>();
	private ArrayList <Float> listprecolocal = new ArrayList <Float>();
	
	public Cardapio(ArrayList <Integer> quantidadelist, ArrayList <Integer> codigolist, ArrayList <String> nomelist) {
		this.listquantidade = quantidadelist;
		this.listcodigo = codigolist;
		this.listnome = nomelist;
	}
	
	public ArrayList <Float> CalculaPreco() {
		float preco = 0;
		listpreco = new ArrayList();
		for(int i = 0; i < getListcodigo().size(); i++) {
			if(getListcodigo().get(i) == 100) {
				preco = 1.20f;
			}
			else if(getListcodigo().get(i) == 101) {
				preco = 1.30f;
			}
			else if(getListcodigo().get(i) == 102) {
				preco = 1.50f;
			}
			else if(getListcodigo().get(i) == 103) {
				preco = 1.20f;
			}
			else if(getListcodigo().get(i) == 104) {
				preco = 1.30f;
			}
			else if(getListcodigo().get(i) == 105){
				preco = 1.00f;
			}

			float precoitem = getListquantidade().get(i) * preco;
			listpreco.add(precoitem);
		}
		
		return listpreco;
	}
	
	public float Soma() {
		float soma = 0;
		listprecolocal = new ArrayList(CalculaPreco());
		for(float elemento : listprecolocal) {
			soma = soma + elemento;
		}
		return soma;
	}

	public ArrayList<Integer> getListquantidade() {
		return listquantidade;
	}

	public void setListquantidade(ArrayList<Integer> listquantidade) {
		this.listquantidade = listquantidade;
	}

	public ArrayList<Integer> getListcodigo() {
		return listcodigo;
	}

	public void setListcodigo(ArrayList<Integer> listcodigo) {
		this.listcodigo = listcodigo;
	}

	public ArrayList<String> getListNome() {
		return listnome;
	}

	public void setListNome(ArrayList<String> listNome) {
		this.listnome = listNome;
	}

	public ArrayList<String> getListnome() {
		return listnome;
	}

	public void setListnome(ArrayList<String> listnome) {
		this.listnome = listnome;
	}

	@Override
	public String toString() {
		return "Cardapio [listquantidade=" + listquantidade + 
				", listcodigo=" + listcodigo + 
				", listpreco=" + listpreco + 
				", listNome=" + listnome + "]";
	}
}
