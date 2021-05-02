package gameDemo;

public class Main {

	public static void main(String[] args) {
		UserValidationManager userManager=new UserValidationManager();
		Gamer gamer =new Gamer( "Salim","Uzun",2002);
		userManager.validate(gamer);
		GamerManager manager=new GamerManager();
		manager.register(gamer);
		
		Game game=new Game("Call of Duty",150);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(null, game);
		
		Campaign campaign=new Campaign(1,20);
		CampaignManager campaignManager1=new CampaignManager();
		campaignManager1.update(campaign, game);
		campaignManager1.delete(campaign, game);
		
		

	}

}
