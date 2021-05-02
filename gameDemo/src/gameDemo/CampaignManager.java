package gameDemo;

public class CampaignManager implements ICampaign {
	

	@Override
	public void add(Campaign campaign, Game game) {
		
		System.out.println("---- OYUN ALIM ��LEM� ----\n");
		System.out.println(game.getGameName()+" /"+" "+"adl� oyuna"+" "+"Kampanya eklendi"+" "+"Oyunun kampanyas�z fiyat� :"+" "+game.getGamePrice()+" TL\n");
		
		
		
	}

	@Override
	public void update(Campaign campaign, Game game) {
		double result=(game.getGamePrice()-game.getGamePrice()*campaign.getDiscountRate()/100);
		System.out.println(game.getGameName()+" /"+" "+" "+"Kampanyal� fiyat� :"+result+" TL"+"\n");
	}

	@Override
	public void delete(Campaign campaign, Game game) {
		System.out.println(game.getGameName()+" /"+" "+"adl� oyunda"+" "+"Kampanya silindi "+" fiyat� :"+" "+game.getGamePrice()+" TL");
		
	}

	


}
