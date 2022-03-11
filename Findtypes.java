package week3.day1;

public class Findtypes {

	public static void main(String[] args) {
		String test="$$ Welcome to 2nd Class of Automation $$ ";
	int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] testCharArray = test.toCharArray();
		
		
		for(int i=0; i<testCharArray.length; i++)
		{
			if(Character.isLetter(testCharArray[i])) {
                letter++;
                
            }
			
			else if(Character.isDigit(testCharArray[i]))
						
			{
				num++;
				
            }	
			
			else if(Character.isWhitespace(testCharArray[i]))
			{
				space++;	
			}
			
			else
			{
				specialChar++;
			}
			
		}
		
	System.out.println("No of Alphabets - "+letter);
	System.out.println("No of Digits - "+num);
	System.out.println("No of White Spaces - "+space);
	System.out.println("No of Special Character - "+specialChar);
	
		
		
		
		
		/*String replaceSapce = test.replace(" ", "");
		String replaceLetter= test.replaceAll("['$1-9\s']", "");
		System.out.println("The letters in the String - "+replaceLetter);
		letter= replaceLetter.length();
		System.out.println("The Total no Of letters in - "+test+ "is ");
		System.out.println(letter);
		String replaceNumber= test.replaceAll("['$a-zA-Z\s']", "");
		System.out.println("The numbers in the String - "+replaceNumber);
		num= replaceNumber.length();
		System.out.println("The Total no Of Numbers in - "+test+ "is");
		System.out.println(num);
		String replaceSpecialchar= test.replaceAll("['1-9a-zA-Z\s']", "");
		System.out.println("The Special Character in the String- "+replaceSpecialchar);
		specialChar= replaceSpecialchar.length();
		System.out.println("The Total no Of Special char in - "+test+ "is ");
		System.out.println(specialChar);
		String replaceSpacer= test.replaceAll("['1-9a-zA-Z$']", "");
		System.out.println("The Special Character in the Space- "+replaceSpacer);
		space= replaceSpacer.length();
		System.out.println("The Total no Of Special char in - "+test+ "is ");
		System.out.println(space);
		*/
		
		
		


	}

}
