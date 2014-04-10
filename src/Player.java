import MyExceptions.*;

public class Player 
{
	private String name;
	private CashAccount konto;
	private ShareDepositAccount depot;
	
	public Player()
	{
		
	}
	
	public Player(String name)
	{
		this.name = name;
		this.depot = new ShareDepositAccount(name + "Depot");
		this.konto = new CashAccount(0, name+"Konto");
	}

	public String getName() {
		return name;
	}

	public CashAccount getKonto() {
		return konto;
	}

	public ShareDepositAccount getDepot() {
		return depot;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void geldEinzahlen(long geld)
	{
		this.konto.addGeld(geld);
	}
	
	public void geldAuszahlen(long geld) throws NotEnoughMoneyException
	{
		if(this.konto.getWert()-geld < 0)
			throw new NotEnoughMoneyException();
		else
			this.konto.removeGeld(geld);
	}
	
	public void buyShare(Share akt, int wieV)
	{
		if(!(( this.konto.getWert() - (wieV * akt.getKurs()) ) < 0))
		{
			ShareItem tmp = new ShareItem(akt, wieV);
			if(this.depot.lookPaket(tmp))
			{
				this.depot.getPaket(tmp).addAktie(wieV);
				
			}else
			{
				this.depot.addPaket(tmp);
			}

			this.konto.removeGeld(wieV * akt.getKurs());
		}else 
		{
			throw new NotEnoughMoneyRun();
		}
	}
	
	public void sellShare(Share akt, int wieV)
	{
		ShareItem tmp = new ShareItem(akt, wieV);
		if(this.depot.lookPaket(tmp))
		{
			this.depot.removePaket(tmp);
			this.konto.addGeld(wieV * akt.getKurs());
		}
		else
			throw new ShareNotExistRun();
	}
}
