package pratice;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]ch= {'a','b','c','d','e'};
		int count=0;
	   for(int i=0;i<ch.length;i++)
	   {
		   if(ch[i]=='a'||ch[i]=='e'||ch[i]=='o')
		   { 
			   System.out.println(ch[i]);
			   count++; 
		   }
	   }
	   System.out.println( +count+  "vowels");

	}

}
