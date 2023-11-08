package accessspecifier;

public class addingstring {

	public static void main(String[] args) {
		String str="happy";
		String res="";
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if(ch>=97&&ch<=122)
			{
				res=res+ch;
			}
			System.out.println(res);
		  
		}
		}
	}





