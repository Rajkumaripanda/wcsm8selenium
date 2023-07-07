package pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Ts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add(2);
		ts.add(1);
		ts.add(8);
	

		ts.add(5);
		System.out.println(ts.add(1));
		try {
		ts.add(true);
		}
		catch(ClassCastException obj)
		{
			System.out.println(obj);
		}
		
		//System.out.println(ts);
		ArrayList al=new ArrayList(ts);
		//System.out.println(al);
		//Collections.reverse(al);
		//System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);


		HashSet hs=new HashSet();
		hs.add("mango");
		hs.add("orange");
		hs.add("apple");
		System.out.println(hs);
		System.out.println(hs.add("mango"));

		ArrayList obj=new ArrayList(hs);
		System.out.println(obj);
		Collections.sort(obj);
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
		

		



		

	}

}
