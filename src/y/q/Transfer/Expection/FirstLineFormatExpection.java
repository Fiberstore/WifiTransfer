package y.q.Transfer.Expection;

/**
 * Created by Cfun on 2015/4/27.
 */
public class FirstLineFormatExpection extends RuntimeException
{
	public FirstLineFormatExpection()
	{
		super("���и�ʽ������");
	}

	public FirstLineFormatExpection(String detailMessage)
	{
		super(detailMessage);
	}
}
