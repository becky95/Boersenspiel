

public class ShareDepositAccount extends Asset
{
	private ShareItem paket [];
	
	public ShareDepositAccount()
	{
		
	}
	
	public ShareDepositAccount(String name)
	{
		super(name);
		ShareItem[] nPaket = new ShareItem[0];
		this.paket = nPaket;
	}
	
	public boolean lookPaket(ShareItem name)
	
	{
		for(int i=0; i < paket.length; i++)
		{
			if(paket[i].getAktie() == name.getAktie())
			{
				return true;
			}
		}
		return false;
	}
	
	public ShareItem getPaket(ShareItem name)
	{
		for(int i=0; i < paket.length; i++)
		{
			if(paket[i].getAktie() == name.getAktie())
			{
				return paket[i];
			}
		}
		return null;
	}
	
	public long getWert()
	{
		long wert = 0;
		for(int i = 0; i < paket.length; i++)
			wert += paket[i].getWert();
		
		return wert;
	}
	
	public void addPaket(ShareItem newAkt)
	{
		for(int i = 0; i < paket.length; i++)
		{
			if(paket[i].getName().equals(newAkt.getName()))
				return;
		}
		ShareItem[] temp  = new ShareItem[paket.length +1];
		for(int i = 0; i < paket.length; i++)
		{
			temp[i] = paket[i];
		}
		temp[temp.length-1] = newAkt;
		this.paket = temp;
	}
	
	public boolean equals(Object obj)
	{
		ShareDepositAccount tmp = new ShareDepositAccount();
		if(obj instanceof ShareDepositAccount)
			tmp = (ShareDepositAccount)obj;
		else
			return false;
		
		if(tmp.getName() == this.getName())
		{
			if(this.getWert() == this.getWert())
				return true;
		}
		
		
		return false;
	}
	
	public void removePaket(ShareItem remAkt)
	{
		ShareItem[] temp = new ShareItem[paket.length -1];
		ShareItem saveP = null;
		for(int i = 0; i < paket.length; i++)
		{
			if(paket[i].equals(remAkt))
				saveP = paket[i];
		}
		if(saveP == null)
			return;
		else
		{
			for(int i = 0, j = 0; i < paket.length; i++)
			{
				if(saveP == paket[i])
					continue;
				temp[j] = paket[i];
				j++;
			}
		}
		this.paket = temp;
	}
	
	public String toString()
	{
		String depot = " ";
		for(int i=0; i < this.paket.length; i++)
		{
			String temp = depot + "\n" + (i+1) + ". " + paket[i].toString();
			depot = temp;
		}
		return "Das ShareDepositAccount: " + this.getName() + depot;
	}	
}
