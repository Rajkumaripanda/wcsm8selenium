package pratice;

public class Stng2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="RAJKumari";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char m = s1.charAt(i);
			if(m=='A'||m=='E'||m=='I'||m=='O'||m=='U'||m=='a'||m=='e'||m=='i'||m=='o'||m=='u')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
