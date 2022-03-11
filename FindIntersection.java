package week3.day1;

import java.util.ArrayList;
import java.util.List;


public class FindIntersection {

	public static void main(String[] args) {
		List <Integer> listOne = new ArrayList<Integer>();		
		listOne.add(3);
		listOne.add(2);
		listOne.add(11);
		listOne.add(4);
		listOne.add(6);
		listOne.add(7);
		List <Integer> listTwo = new ArrayList<Integer>();		
		listTwo.add(1);
		listTwo.add(2);
		listTwo.add(8);
		listTwo.add(4);
		listTwo.add(9);
		listTwo.add(7);
		
		
		for(int i=0; i<listOne.size(); i++) 
		{
			for(int j=0; j<listTwo.size(); j++)
			{
				if(listOne.get(i)==listTwo.get(j))
				{
					System.out.println(listOne.get(i));
				}
				
			}
			
			
		}


	}

}
