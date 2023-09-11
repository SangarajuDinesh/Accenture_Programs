
public class LinearSearchDemo 
{
	public boolean linearSearch(int arr[],int key)
	{
		boolean isFound=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				isFound=true;
				break;
			}
			else
			{
				isFound=false;
			}
		}
		return isFound;
	}
}
