import java.util.Scanner;

public class XorLeadNumbers 
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[sc.nextInt()];
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        Result r1=new Result();
        System.out.println(r1.divisibleSumPairs(n,k,ar));
        sc.close();
        
    }
}
