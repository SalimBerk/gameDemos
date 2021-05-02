package gameDemo;

public class Gamer {
	private String name;
	private String surname;
	private int birthYear;
	
	public Gamer( String name, String surname, int birthYear) {
		
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

}
