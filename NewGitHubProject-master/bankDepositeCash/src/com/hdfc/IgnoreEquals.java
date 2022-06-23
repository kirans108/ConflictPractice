package com.hdfc;

public class IgnoreEquals {
	public static void main (String args[]) {
		String s1="Javaclass";
		String s2="JavaClass";
		String s3="Javaclass";
		String s4="Python";
		System.out.println(s1.compareToIgnoreCase (s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s3.compareToIgnoreCase(s4));
	

}
}