import MyExceptions.*;

public class AccountManagerImpl implements AccountManager

{
//	public final Share[] BOERSE = new Share[3];

	public AccountManagerImpl() {
//		BOERSE[0] = new Share("MAN", 600);
//		BOERSE[1] = new Share("Google", 1200);
//		BOERSE[2] = new Share("HS-Augsburg", 645);
		spieler = new Player[0];
	}

	private Player spieler[];

	public void createPlayer(String name)//
	{
		Player tmp = new Player(name);
		for (int i = 0; i < this.spieler.length; i++) {
			if (this.spieler[i].getName().equals(name))
				throw new PlayerAlreadyExist();
		}

		Player[] tmpArray = new Player[this.spieler.length + 1];
		for (int i = 0; i < this.spieler.length; i++) {
			tmpArray[i] = spieler[i];
		}
		tmpArray[tmpArray.length - 1] = tmp;
		this.spieler = tmpArray;
	}

	public Player getPlayer(String name) {
		for (int i = 0; i < spieler.length; i++) {
			if (spieler[i].getName().equals(name))
				return spieler[i];
		}

		throw new PlayerDoNotExistException();
	}

//	private Share getShare(String akt) {
//		for (int i = 0; i < this.BOERSE.length; i++) {
//			if (this.BOERSE[i].getName().equals(akt))
//				return BOERSE[i];
//		}
//		throw new ShareNotExistRun();
//	}

	public void buyShare(String name, String akt, int wieV) {
		getPlayer(name).buyShare(getShare(akt), wieV);
	}

	public void sellShare(String name, String akt, int wieV) {
		getPlayer(name).sellShare(getShare(akt), wieV);
	}

	public long getWertAsset(String name) {
		for (int i = 0; i < this.spieler.length; i++) {
			if (spieler[i].getName().equals(name))
				return spieler[i].getDepot().getWert()
						+ spieler[i].getKonto().getWert();
			else if (spieler[i].getDepot().getName().equals(name))
				return spieler[i].getDepot().getWert();
			else if (spieler[i].getKonto().getName().equals(name))
				return spieler[i].getKonto().getWert();
		}
		throw new NoCorrectObject();
	}

}
