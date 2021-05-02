package gameDemo;

public class CampaignManager implements ICampaign {
	

	@Override
	public void add(Campaign campaign, Game game) {
		
		System.out.println("---- OYUN ALIM ÝÞLEMÝ ----\n");
		System.out.println(game.getGameName()+" /"+" "+"adlý oyuna"+" "+"Kampanya eklendi"+" "+"Oyunun kampanyasýz fiyatý :"+" "+game.getGamePrice()+" TL\n");
		
		
		
	}

	@Override
	public void update(Campaign campaign, Game game) {
		double result=(game.getGamePrice()-game.getGamePrice()*campaign.getDiscountRate()/100);
		System.out.println(game.getGameName()+" /"+" "+" "+"Kampanyalý fiyatý :"+result+" TL"+"\n");
	}

	@Override
	public void delete(Campaign campaign, Game game) {
		System.out.println(game.getGameName()+" /"+" "+"adlý oyunda"+" "+"Kampanya silindi "+" fiyatý :"+" "+game.getGamePrice()+" TL");
		
	}

	


}
