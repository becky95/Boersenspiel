

public class CashAccount extends Asset
{
	private long geld;
	
	public CashAccount()
	{
		
	}
	
	public CashAccount(long geld, String name)
	{
		super(name);
		this.geld = geld;
	}
	
	public long getWert()
	{
		return this.geld;
	}
	
//	public long getMoney()
//	{
//		return this.geld;
//	}
	
	public String toString()
	{
		return "Das CashAccount " + this.getName() + " hat einen momentanen Wert von " + this.getWert() + " $";
	}
	
	public void addGeld(long addG)
	{
		this.geld += addG;
	}
	
	public void removeGeld(long remG)
	{
		this.geld -= remG;
	}
	// b-laaaa
	
}
