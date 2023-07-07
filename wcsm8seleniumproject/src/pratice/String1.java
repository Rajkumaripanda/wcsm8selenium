package pratice;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is a secured programming language";
		String []str=s.split(" ");
		String news=" ";
		//reverse every word but sentence sequence is same
		for(int i=0;i<str.length;i++)
		{
			StringBuilder sb1= new StringBuilder( str[i]);
			 news += sb1.reverse() +" ";

			
		}
		System.out.println(news);
		StringBuilder sb2= new StringBuilder( s);
		//reverse the sentence using reverse method
		StringBuilder temp = sb2.reverse();
		System.out.println(temp);
		String s1="devo";
		//replace method
		StringBuilder sb3= new StringBuilder( s1);
		StringBuilder temp2 = sb3.replace(0, 3, "Beb");
		System.out.println(temp2);
		//count the words in a given string
		String s2="i love india";
		int count=0;
		for(int i=0;i<s2.length();i++) 
		{
			char temp3 = s2.charAt(i);
			if(i==0 && temp3 !=' ')
			{
				count++;
			}
			else if(i<=s2.length()-1 && temp3 !=' ' &&  s2.charAt(i-1)==' ')
			{
				count++;
			}
			
			
		}
      System.out.println(count);
		

		
	

	}

}
