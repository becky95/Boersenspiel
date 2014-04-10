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
		return "Der Name des Vermögenswertes ist: " + this.name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public abstract long getWert();
}
