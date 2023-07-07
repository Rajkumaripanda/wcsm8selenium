package pratice;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int c,r,s;
		s=0;
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(r*r*r)+s;
			n=n/10;
	    }
		if(c==s)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}

	}

	

}
