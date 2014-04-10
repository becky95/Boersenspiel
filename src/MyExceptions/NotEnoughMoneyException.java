package MyExceptions;

public class NotEnoughMoneyException extends Exception
{
	public NotEnoughMoneyException()
	{
		super("Sie haben nicht genügend Budget, Sie Trottel!");
	}
}
