
public class Result 
{
	public int divisibleSumPairs(int n, int k, int[] ar) 
    {
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=1;j<ar.length;j++)
            {
                if((ar[i]+ar[j])%k==0)
                {
                	System.out.println(count++);
                }
            }
        }
        return count;
    }
}
