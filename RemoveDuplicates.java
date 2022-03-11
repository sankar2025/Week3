package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		String trimText = text.replace(" ", "");
		System.out.println(trimText);
		String finalText="";
		
		char[] charArrayText = trimText.toCharArray();
		for(int i=0; i<trimText.length()-1; i++)
		{
			
			for(int j=i+1; j<=charArrayText.length-1;j++)
			{
				
				//System.out.println("i= "+i +" i place char "+charArrayText[i]);
				//System.out.println("i= "+j +" j place char "+charArrayText[j]);
				
				if(charArrayText[i]==charArrayText[j])
				{
					
					count=count+1;
					//System.out.println(charArrayText[i]);
					//System.out.println("count "+count);
				
				if(count>1)
				{
					
					charArrayText[i]=' ';
										
				}
				
				}
			
			}
			
		
		}
		
		for(int i=0; i<charArrayText.length-1; i++)
		{
			
			finalText=finalText+charArrayText[i];
			//System.out.print(charArrayText[i]);	
		}
		
		
		String replace = finalText.replace(" ", "");
		System.out.println(replace);
		

	}

}
