package stringsAssignment1;

public class UCTLowercase {

	public static void main(String[] args) {
		String st="RAMYA";
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=65&&ch<=90)
			{
	         ch+=32;
			   
		      }
			 System.out.println(ch);
		}
	}
}
	        


