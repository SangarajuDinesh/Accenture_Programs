
public class RBGColourInversionDemo 
{

	public int[] rbgColourInversion(int[] arr) 
	{
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			res[i]=255-arr[i];
		}
		return res;
	}
	
}
