package pratice;

public class Stng5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="raj123kumari";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char m = s1.charAt(i);
			if(Character.isDigit(m))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
