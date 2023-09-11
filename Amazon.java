
public class Amazon 
{
	public static void main(String[] args) 
	{
		int n=5;
		int x=60;
		int arr[]= {31,25,85,29,35,60};
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((arr[i]+arr[j])%x==0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
