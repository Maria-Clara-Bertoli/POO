package POO;

public class Televisor {
	
	private int canal;
	private int volume;
	
	public Televisor() {
		this.canal = 1;
		this.volume = 1;
	}
	
	public int AumentarVolume() {
		if(getVolume() < 30) {
		setVolume(getVolume() + 1);
		}
		else {
		System.out.println("Faixa ultrapassada.");	
		}
		return getVolume();
	}
	
	public int DiminuirVolume() {
		if(getVolume() > 0) {
		setVolume(getVolume() - 1);
		}
		else {
		System.out.println("Faixa ultrapassada.");	
		}
		return getVolume();
	}
	
	public int TrocarCanalMais() {
		if(getCanal() < 50) {
		setCanal(getCanal() + 1);
		}
		return getCanal();
	}
	
	public int TrocarCanalMenos() {
		if(getCanal() > 0) {
		setCanal(getCanal() - 1);
		}
		return getCanal();
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Televisor [canal=" + canal + ", volume=" + volume + "]";
	}
}
