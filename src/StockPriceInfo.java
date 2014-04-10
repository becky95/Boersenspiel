import MyExceptions.NotEnoughMoneyException;


public interface StockPriceInfo 
{
	long getKurs(String name);	
	String getallShareKurs();
}
