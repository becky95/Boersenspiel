import MyExceptions.*;


public interface AccountManager 
{
	void buyShare(String name, String akt, int wieV) throws NotEnoughMoneyException;
	void sellShare(String name, String akt, int wieV);
	void createPlayer(String name);
	long getWertAsset(String  name);
}
// bla bla
// ändere mal etwas 
