package week3.day1;

public class Reverseevenwords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String replaceTest = test.replace(" ","");
		System.out.println(replaceTest);
		char[] testArray = replaceTest.toCharArray();
		String oddArray = "";
		String evenArray = "";
		
		for(int i=1;i<testArray.length-1; i++)
		{
			
			if (!(i%2==0))
			{
				oddArray= oddArray + testArray[i];
			System.out.println(i +" Odd vlaue in aray   "+oddArray);
				
			}
		}

		
		for(int i=testArray.length-1;i>=1; i--)
		{
			
			if ((i%2==0))
			{
				evenArray= evenArray + testArray[i];
			System.out.println(i +" Even vlaue in aray   "+evenArray);
				
			}
			else
			{
				
				System.out.println(testArray[i]);
			}
		}
		


	}

}
