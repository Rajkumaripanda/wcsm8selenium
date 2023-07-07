package pratice;

public class Stng3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="NaVigATE";
		int countL=0;
		int countU=0;
		for(int i=0;i<s1.length();i++)
		{
		       char m = s1.charAt(i);
		       if(m=='A'||m=='E'||m=='I'||m=='O'||m=='U')
		       {
		    	   countU++;
		       }
		       else if(m=='a'||m=='e'||m=='i'||m=='o'||m=='u')
		       {
		    	   countL++;
		       }
		}
		System.out.println(countU);
		System.out.println(countL);


	}

}
