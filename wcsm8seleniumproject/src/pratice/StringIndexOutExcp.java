package pratice;

public class StringIndexOutExcp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		try
		{
			System.out.println(s1.charAt(4));
	
		}
		catch(StringIndexOutOfBoundsException obj)

		{
			System.out.println(obj);
		}
		System.out.println("raj");
		
		
		
		
		
		



		

	}

}
