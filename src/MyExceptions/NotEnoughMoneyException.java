package MyExceptions;

public class NotEnoughMoneyException extends Exception
{
	public NotEnoughMoneyException()
	{
		super("Sie haben nicht gen�gend Budget, Sie Trottel!");
	}
}
