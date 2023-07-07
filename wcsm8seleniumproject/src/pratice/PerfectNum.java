package pratice;

public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==n)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
		
		

	}

}
