package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MissingElement {

	public static void main(String[] args) {

		List <Integer> listOne = new ArrayList<Integer>();		
		listOne.add(1);
		listOne.add(2);
		listOne.add(3);
		listOne.add(4);
		listOne.add(7);
		listOne.add(6);
		listOne.add(8);	
	
Collections.sort(listOne);
for(int i=0;i<listOne.size(); i++)
{
System.out.println("i value " +"i="+i +" "+ listOne.get(i));
}

for(int i=listOne.get(0); i<=listOne.size(); i++) 
{
	
	if(i+1!=listOne.get(i))
	{
	System.out.println("The Missing Number is "+(i+1));
		break;				
	}
	
	

	}

	}

}
