package com.cts.traverse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class MyAppPro {	

		

			public static void main(String[] args) {
				List<StringBuffer> strList=new ArrayList<StringBuffer>();
				strList.add(new StringBuffer("First"));
				strList.add(new StringBuffer("second"));
				strList.add(new StringBuffer("third"));
				strList.add(new StringBuffer("fourth"));
				System.out.println(strList);

			/*
			Iterator<String> iterator=strList.iterator();
			while(iterator.hasNext()) {
				String str=iterator.next();
				System.out.println(str);
				if(str.equals("third"));
				iterator.remove();
			}*/
				/*for(StringBuffer str:strList)
				{
					System.out.println(str);
					str=str.append("pro");
				}
			System.out.println(strList);*/
				
				
	}

	}


 