package pratice;



public class Program4{
	
	   public static String  convert (String s)
	   {
		char[] m = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(i==0 && m[i]!=' ' || m[i] != ' ' &&  m[i-1] ==' ')
			{
				if(m[i]>='a'&& m[i]<='z')
				{
					m[i]=(char) (m[i] - 'a' + 'A');
				
					
				}
			}
			else if(m[i]>='A'&& m[i]<='Z')
			{
				m[i]=(char) (m[i] +  'a' - 'A');
				
			}
		}
		String st=new String (m);
		return st;
	}
public static void  main( String[]args)
	{
			String s="i love india";
			System.out.print(convert(s));
			 }

	}
  

