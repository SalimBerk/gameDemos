package gameDemo;

public class UserValidationManager implements IUserValidation{

	@Override
	public void validate(Gamer gamer) {
		if(gamer.getName()=="Salim"&&gamer.getSurname()=="Uzun"&&gamer.getBirthYear()==2002) {
			System.out.println("---- KULLANICI DO�RULAMA ----");
			System.out.println(gamer.getName()+" "+"adl� kullan�c� giri� yapt�.\n");
			}
		else {
			System.out.println("giri� yap�lamad�.");
		}


		
	}

}
