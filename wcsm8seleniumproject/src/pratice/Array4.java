package pratice;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n= {2,-9,-8,-6,-5,8,7};
		int ponum=0;
		int nenum=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]>0)
			{
				ponum++;
			}
			else
			{
				nenum++;
			}
		}
		System.out.println(ponum);
		System.out.println(nenum);

	}

}
