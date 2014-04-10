package MyExceptions;

public class ShareNotExistRun extends RuntimeException
{
	public ShareNotExistRun()
	{
		super("Davon besitzen Sie leider keine Aktien!!");
	}
}
