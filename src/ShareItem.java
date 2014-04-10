public class ShareItem extends Asset
{

	private Share aAktie;
	private int anzAkt;
	private long gesamtEinkaufswert;
	//private long saveWert;
	
	public ShareItem()
	{
		
	}
	
	public ShareItem (Share akt)	
	{
		super(akt.getName());
		this.aAktie = akt;
		this.anzAkt = 0;
		this.gesamtEinkaufswert = 0;
		//this.saveWert = 0;
	}
	
	public boolean equals(Object obj)
	{
		ShareItem tmp = new ShareItem();
		if(obj instanceof ShareItem)
			tmp = (ShareItem)obj;
		else
			return false;
		
		if(this.anzAkt == tmp.getAnz())
		{
			if(this.aAktie == tmp.getAktie())
				if(this.gesamtEinkaufswert == tmp.getEinkaufswert())
					return true;
		}
		
		return false;
	}
	
	public ShareItem (Share akt, int wieV)
	{
		super(akt.getName());
		this.aAktie = akt;
		this.anzAkt = wieV;
		this.gesamtEinkaufswert = wieV * akt.getKurs();
		//this.saveWert = akt.getKurs();
	}
	
	public long getWert()
	{
		return this.aAktie.getKurs() * this.anzAkt;
	}
	
	public int getAnz()
	{
		return this.anzAkt;
	}
	
	public Share getAktie()
	{
		return this.aAktie;
	}
	
	public String toString()
	{
		return "Name der Share: " + this.aAktie.getName() + " hat den Aktuellen Kurs: " + this.aAktie.getKurs()
				+ " wovon wir " + this.anzAkt + " Aktien besitzen. Einkaufswert: " +this.gesamtEinkaufswert;	
	}
	
	public void addAktie(int wieV)
	{
		this.anzAkt += wieV;
		this.gesamtEinkaufswert += this.aAktie.getKurs() * wieV;
		//this.saveWert = this.aAktie.getKurs();
	}
	
	public void removeAktie(int wieV)
	{
		if(!( (this.getAnz() - wieV) < 0))
		{
			this.gesamtEinkaufswert -= wieV * this.aAktie.getKurs()/* * this.saveWert*/;
			if(this.gesamtEinkaufswert < 0)
				this.gesamtEinkaufswert = 0;
			this.anzAkt -= wieV;
		}
		else
		{
			this.anzAkt = 0;
			this.gesamtEinkaufswert = 0;

		}
	}
	
	public long getEinkaufswert()
	{
		return this.gesamtEinkaufswert;
	}
}
