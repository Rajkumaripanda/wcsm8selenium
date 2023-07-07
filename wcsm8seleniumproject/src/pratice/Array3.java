package pratice;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]n= {2,3,4,5,6,7};
		int count=0;
		for(int i=0;i<n.length;i++)
		{
		  if(n[i]%2==0)
		  {
			   System.out.println(n[i]);
			   count++;
			   
			  
	      }
		}
		System.out.println("there are " +count+  " even number.");
	}

}
