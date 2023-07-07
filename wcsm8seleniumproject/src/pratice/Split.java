package pratice;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="  raj  ";
		System.out.println(s);
		System.out.println(s.length());
		String m = s.trim();
		System.out.println(m);
		System.out.println(m.length());
		String s1=" raj subha suchi ";
		System.out.println(s1);
		String[]s2=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		
		

	}
}
