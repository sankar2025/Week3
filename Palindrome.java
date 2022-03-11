package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		String value ="madam";
		String rev="";
		char[] CharValue = value.toCharArray();
		
		for (int i=CharValue.length-1; i>=0; i--)
		{
			
			
			rev=rev + CharValue[i];
			//System.out.println(CharValue[i]);
			//System.out.println(rev);
			
		}
		
		if(value.equals(rev))
		{
			System.out.println(value+ " is Palindrome");
		}
		
		else
		{
			System.out.println(value+ " is not Palindrome");
		}


	}

}
