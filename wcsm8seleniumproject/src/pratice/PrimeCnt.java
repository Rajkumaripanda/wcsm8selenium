package pratice;

public class PrimeCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int total=0;
		for(int i=2;i<=100;i++)
		{
			int count=0;
			for(int j=2;j< i;j++)
			{
				if(i%j==0)
				{
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
				total=total+1;
			}
			

		}
		System.out.println("Total prime number is:"+total);

		

	}

}
