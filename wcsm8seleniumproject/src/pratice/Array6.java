package pratice;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = { 'A', 'a', 'E', 'I', 'U', 'g', 'h', 'N' };
		int uch = 0;
		int Lch = 0;
		int vch = 0;
		int uvch = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {

				uch++;
			}
			if (ch[i] >= 'a' && ch[i] <= 'z') {

				Lch++;
			}
			if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U' || ch[i] == 'a'
					|| ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
				
			{
				vch++;

			}
			if (ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				uvch++;
			}
		}

		System.out.println(uch);//5
		System.out.println(Lch);//3
		System.out.println(vch);//5
		System.out.println(uvch);//4

	}

}
