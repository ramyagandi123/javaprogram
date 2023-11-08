package stringsAssignment1;

public class lettersOne {

	public static void main(String[] args) {
  String str="a1b2c2";
  for(int i=0;i<str.length();i++) {
	  if(Character.isAlphabetic(str.charAt(i)))
	  {System.out.println(str.charAt(i));
	  
	  }
	  else {
		  int x=Character.getNumericValue(str.charAt(i));
		  for(int j=1;j<x;j++)
		  {
			  System.out.println(str.charAt(i-1));
		  }

	}

}
	}
}
