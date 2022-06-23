package com.hdfc;

public class CalSumAndMul extends FirstClassSumAndMul {
	public static void main (String[] args) {
		CalSumAndMul cam = new CalSumAndMul();
		 int result =cam.multiofGivenNumbers(10, 20, 30);
		 System.out.println("The Multiplication of three Numbers:"+result);
	}
	public void getText() {
		System.out.println("This is From GetText Method");
	}
	
	public void dragAndDrop() {
		System.out.println("This is From dragAndDrop Method");
	
}
	public int subofgivenNumbers (int a, int b) {
		int c=a-b;
		return c;
	
}
}
