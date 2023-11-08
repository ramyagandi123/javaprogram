package stringsAssignment1;

    public static void print countchar(String,str)
	{
		int countAlphabets=0;
		int countDigits=0;
		
         for(int i=0;i<st.length();i++);
          { 
	       char ch=charAt(i);
	       if((ch>=65&&ch<=90)||(ch>=97&&ch<=102))
	       {
	    	   countAlphabets++;
	       }
	       else if(ch>=48&&ch<=57)
	       {
	    	   countDigits++;
	       }
	       else
	       {
	    	countSymbols++;   
	       }
	       System.out.println(countAlphabets);
	       System.out.println( countDigits);
	       System.out.println(countSymbols);
            }
          public static void main (String[]args)
          {
      		String st="ramya@123";
              print AlphabetsDigitsSymbols();
          }

          }
}
}