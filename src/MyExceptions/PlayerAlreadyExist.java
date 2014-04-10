package MyExceptions;

public class PlayerAlreadyExist extends RuntimeException
{
	public PlayerAlreadyExist()
	{
		super("Spieler existiert bereits!");
	}
}
