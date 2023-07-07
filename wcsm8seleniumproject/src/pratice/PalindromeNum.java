package pratice;

public class PalindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int c,r,s;
		s=0;
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
	}
		if(c==s)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not a palindrome number");
		}

	}

}
