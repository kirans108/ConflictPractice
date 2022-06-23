package com.practice;

public class StringRevTest {

	public static void main(String[] args) {

		String str = "hello world";
		//Method 1
		
		StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    System.out.println(sb.toString());
	    
	    
	    //Method 2
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    System.out.println(rev);
		system.out.println("This is from github");
	
	}

}
