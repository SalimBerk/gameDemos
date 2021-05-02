package gameDemo;

public class GamerManager implements IGamer {

	@Override
	public void register(Gamer gamer) {
		System.out.println("---- KULLANICI BÝLGÝLERÝ ----");
		System.out.println("Kullanýcý adý :"+gamer.getName());
		System.out.println("---------------------------------");
		System.out.println("Kullanýcý soyadý :"+gamer.getSurname());
	
		System.out.println("---------------------------------");
		System.out.println("Kullanýcýnýn doðum yýlý :"+gamer.getBirthYear());
		System.out.println("---------------------------------");
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Kullanýcý güncellendi :"+gamer.getName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Kullanýcý silindi :"+gamer.getName());
		
	}


}
