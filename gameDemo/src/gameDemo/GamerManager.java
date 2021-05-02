package gameDemo;

public class GamerManager implements IGamer {

	@Override
	public void register(Gamer gamer) {
		System.out.println("---- KULLANICI B�LG�LER� ----");
		System.out.println("Kullan�c� ad� :"+gamer.getName());
		System.out.println("---------------------------------");
		System.out.println("Kullan�c� soyad� :"+gamer.getSurname());
	
		System.out.println("---------------------------------");
		System.out.println("Kullan�c�n�n do�um y�l� :"+gamer.getBirthYear());
		System.out.println("---------------------------------");
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullan�c� g�ncellendi :"+gamer.getName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullan�c� silindi :"+gamer.getName());
		
	}


}
