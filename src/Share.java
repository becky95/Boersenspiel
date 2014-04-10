

public class Share 
{
	private final String NAME;
	private long kurs;
	
	public Share()
	{
		this.NAME = "";
	}
	
	public Share(String name, long kurs)
	{
		this.NAME = name;
		this.kurs = kurs;
	}
	
	public void setKurs(long kurs)
	{
		this.kurs = kurs;
	}
	
	public String getName()
	{
		return this.NAME;
	}
	
	public long getKurs()
	{
		return this.kurs;
	}
	
	public boolean equals(Object aktie2)
	{
		Share b = new Share();
		if(aktie2 instanceof Share)
			b = (Share) aktie2;
		
		if(this.NAME.equals(b.getName()) 
				&& this.kurs == b.getKurs())
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	public String toString() 
	{
		return "Die Share: " + this.NAME + " hat den Momentanen Kurs: " + this.kurs;
	}
}
