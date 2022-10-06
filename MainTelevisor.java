package POO;

public class MainTelevisor {

	public static void main(String[] args) {

		Televisor televisor = new Televisor();
		
		televisor.AumentarVolume();
		televisor.AumentarVolume();
		televisor.DiminuirVolume();
		televisor.TrocarCanalMais();
		televisor.TrocarCanalMais();
		televisor.TrocarCanalMais();
		televisor.TrocarCanalMenos();
		System.out.println("Volume: " + televisor.getVolume());
		System.out.println("Canal: " + televisor.getCanal());
	}
}
