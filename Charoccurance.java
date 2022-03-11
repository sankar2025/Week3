package week3.day1;

public class Charoccurance {

	public static void main(String[] args) {
		String name1 = new String("welcome to chennai");
		String lowerCase = name1.toLowerCase();
		System.out.println(lowerCase);
		char[] occur=lowerCase.toCharArray();
		int count=0;
		for(int i=0; i<occur.length; i++)
		{
			if(occur[i]=='e')	
					{
				count= count +1;
				
					}
		}
		
		System.out.println("The occurance of e "+count);


	}

}
