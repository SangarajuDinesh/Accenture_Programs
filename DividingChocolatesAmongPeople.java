import java.util.*;

public class DividingChocolatesAmongPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
        	if(n<=k/2)
        	{
        		for(int j=1;j<=k;j++)
        		{
        			if(i+j==6)
        			{
        				count++;
        			}
        		}
        	}
        	else
        	{
        		count=0;
        	}
        }
        System.out.println(count);
        scanner.close();
    }
}
