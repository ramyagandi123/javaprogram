package stringsAssignment1;

public class UpperCaseToLowercase {

	public static void main(String[] args) {
		String st="ramya";
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=97&&ch<=122)
			{
				ch-=32;
			}
			System.out.println(ch);
		}
	}
}
