package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> arrayList = new ArrayList<String>();
		
		//2. Add five Strings to your list
		arrayList.add("apple0");
		arrayList.add("banana1");
		arrayList.add("lemon2");
		arrayList.add("lime3");
		arrayList.add("mango4");
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < arrayList.size(); i++)
		{
			String str = arrayList.get(i);
			System.out.println(str);
		}
		
		System.out.println("");
		
		//4. Print all the Strings using a for-each loop
		for(String i: arrayList)
		{
			System.out.println(i);
		}
		
		System.out.println("");
		
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < arrayList.size(); i+=2)
		{
			String str = arrayList.get(i);
			System.out.println(str);
		}
		
		System.out.println("");
		
		//6. Print all the Strings in reverse order.
		for(int i = arrayList.size() - 1; i >= 0; i--)
		{
			String str = arrayList.get(i);
			System.out.println(str);
		}
		
		System.out.println("");
		
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i < arrayList.size(); i++)
		{
			String str = arrayList.get(i);
			if(str.contains("e"))
			{
				System.out.println(str);
			}
		}
	}
}
