package pratice;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rajKUMARI";
		char[] m = s.toCharArray();

		for(int i=0;i<3;i++) 
		{
			char c = m[i];
			if(c>='a'&& c<='z')
			{
				m[i]=(char) (c-32);
				System.out.println(m[i]);
			}
			
		}
		for(int i=3;i<s.length();i++)
		{
			char c=m[i];
			if(c>='A'&&c<='Z')
			{
				m[i]=(char)(c+32);
				System.out.println(m[i]);
			}
		}

	}

}
