package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DuplicateInString {

	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		list.add("Adam");
		list.add("Ben");
		list.add("Zara");
		list.add("Adam");
		list.add("Charlie");
		list.add("James");
		list.add("Ben");
		
		Collections.sort(list);
		for(int i=0;i<list.size(); i++)
		{
	System.out.println("i value " +"i="+i +" "+ list.get(i));
	
			
	}
		
		System.out.println(list.size());
		
		
		
		for(int i=0; i<list.size()-1;i++)
		{
			
			for(int j=i+1; j<=list.size()-1; j++)
			{
			//System.out.println("i value "+" i="+i+ " "+list.get(i));
	        //System.out.println("j value "+"j= "+j+" " +list.get(j));
			if(list.get(i)==(list.get(j)))
			{
				
				System.out.println("The Duplicate names are  "+list.get(i));
				
								
			}
			
			}
			
		}

	}

}
