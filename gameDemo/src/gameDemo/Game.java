package gameDemo;

public class Game {
	private String GameName;
	private int GamePrice;
	
	
	public Game(String gameName, int gamePrice) {
		
		GameName = gameName;
		GamePrice = gamePrice;
	}


	public int getGamePrice() {
		return GamePrice;
	}


	public void setGamePrice(int gamePrice) {
		GamePrice = gamePrice;
	}


	public String getGameName() {
		return GameName;
	}


	public void setGameName(String gameName) {
		GameName = gameName;
	}

}
