package MyExceptions;

public class PlayerDoNotExistException extends RuntimeException
{
	public PlayerDoNotExistException()
	{
		super("Der Spieler existiert nicht!");
	}
}
