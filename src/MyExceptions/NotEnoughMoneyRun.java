package MyExceptions;

public class NotEnoughMoneyRun extends RuntimeException
{
	public NotEnoughMoneyRun()
	{
		super("Fehler: Nicht genug Geld!");
	}
}
