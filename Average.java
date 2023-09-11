
public class Average 
{
	public static void main(String[] args) 
	{
		int arr[]= {4,2,3,4,2};
		int size=arr.length/2;
		int sum=0;
		int count1=0;
		for(int i=0;i<size;i++)
		{
			sum+=arr[i];
			count1++;
		}
		int res=sum/count1;
		for(int i=size;i<arr.length;i++)
		{
			sum+=arr[i];
			count1++;
		}
		int res1=sum/count1;
		if(res==res1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
