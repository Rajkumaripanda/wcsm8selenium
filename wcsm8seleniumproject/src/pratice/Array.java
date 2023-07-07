package pratice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n= {1,2,3,4,5};
		System.out.println(n);
        System.out.println(n.length);
       System.out.println(n[0]);
       try
       {
    	   System.out.println(n[6]);
       }
       catch(ArrayIndexOutOfBoundsException obj)
       {
    	   System.out.println(obj);
       }
       System.out.println(n[4]);
       
       
       
     
       
       
	}

}
