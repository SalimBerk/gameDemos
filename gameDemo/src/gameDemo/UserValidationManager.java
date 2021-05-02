package gameDemo;

public class UserValidationManager implements IUserValidation{

	@Override
	public void validate(Gamer gamer) {
		if(gamer.getName()=="Salim"&&gamer.getSurname()=="Uzun"&&gamer.getBirthYear()==2002) {
			System.out.println("---- KULLANICI DOÐRULAMA ----");
			System.out.println(gamer.getName()+" "+"adlý kullanýcý giriþ yaptý.\n");
			}
		else {
			System.out.println("giriþ yapýlamadý.");
		}


		
	}

}
