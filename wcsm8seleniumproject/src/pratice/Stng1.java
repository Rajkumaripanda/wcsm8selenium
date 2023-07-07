package pratice;

public class Stng1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RAJKumari";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char m = s1.charAt(i);
			if(m>='a'&& m<='z')
			{
				
				count++;

				
			}
			
            
		}
        System.out.println(count);


	}

}
