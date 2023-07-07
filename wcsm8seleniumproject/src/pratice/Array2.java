package pratice;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n= {12,34,45,67,87,90};
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2==0)
			{
			   sum=sum+n[i];
			}
		}
		System.out.println(sum);
		

	}

}
