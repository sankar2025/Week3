package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLarge {

	public static void main(String[] args) {
		List <Integer> listOne = new ArrayList<Integer>();		
		listOne.add(13);
		listOne.add(2);
		listOne.add(11);
		listOne.add(14);
		listOne.add(6);
		listOne.add(17);
		
		
		
Collections.sort(listOne);
//System.out.println(listOne.size());
int second= listOne.size()-2;
//System.out.println(second);

for(int i=0;i<listOne.size(); i++)
{
System.out.println("i value " +"i="+i +" "+ listOne.get(i));

	
}

System.out.println("The Second Loargest number is "+listOne.get(second));

	}

}
