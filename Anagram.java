package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length() == text2.length())
		{
			
			char[] text1Array = text1.toCharArray();
			char[] text2Array = text2.toCharArray();
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);					
			System.out.println("Length same");
			
			for(int i=0;i<text1.length(); i++)
			{
					
				
				
				if(text1Array[i]== text2Array[i])
				{
					
					System.out.println("Text 1 " +text1Array[i]);
					System.out.println("Text 2 " +text2Array[i]);
					System.out.println(text1Array[i]);
				}
			}
						
		}
		


	}

}
