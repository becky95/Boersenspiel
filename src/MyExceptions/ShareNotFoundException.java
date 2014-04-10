package MyExceptions;

public class ShareNotFoundException extends RuntimeException
{
	public ShareNotFoundException()
	{
		super("Aktie nicht gefunden!");
	}
}
