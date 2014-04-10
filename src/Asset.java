public abstract class Asset 
{
	private String name;
	
	public Asset()
	{
		
	}
	
	public Asset(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "Der Name des Verm�genswertes ist: " + this.name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public abstract long getWert();
}
