package pratice;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the name:");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		System.out.println("Name is:"+name);
		s.close();
		String s1="hello raj";
		Scanner sc=new Scanner(s1);
		System.out.println("Boolean result :"+sc.hasNext());
		System.out.println("String :"+sc.nextLine());
		sc.close();

	}

}
