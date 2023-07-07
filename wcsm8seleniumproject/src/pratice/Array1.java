package pratice;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]n;
		n=null;
		System.out.println(n);
		try
		{
			System.out.println(n.length);

		}
		catch(NullPointerException obj)
		{
			System.out.println(obj);
		}
		System.out.println("hello");

	}

}
