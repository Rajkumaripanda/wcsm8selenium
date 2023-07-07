package pratice;

public class CountPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count;
		for(i=1;i<=50;i++)
		{
			count=0;
			for(j=i;j<=i;j++)
			{
				if(j%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}

	}

}
