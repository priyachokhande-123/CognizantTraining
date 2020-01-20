package com.cts.traverse;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyApp {

	public static void main(String[] args) {
		List<String> strList=new ArrayList<String>();
		strList.add("First");
		strList.add("second");
		strList.add("third");
		strList.add("fourth");
		System.out.println(strList);

	/*
	Iterator<String> iterator=strList.iterator();
	while(iterator.hasNext()) {
		String str=iterator.next();
		System.out.println(str);
		if(str.equals("third"));
		iterator.remove();
	}*/
		/*for(String str:strList)
		{
			System.out.println(str);
			str=str+"pro";
		}*/

		Object arr[]=strList.toArray();
		String sarr[]=strList.toArray(new String[0]);
		System.out.println(Arrays.toString(sarr));
		strList.set(3, "newvalue");
		sarr[3]="check";
		System.out.println();
	System.out.println(strList);
	System.out.println(Arrays.toString(sarr));
	
	}
}
