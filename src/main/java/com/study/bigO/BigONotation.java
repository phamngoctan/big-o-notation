package com.study.bigO;

public class BigONotation {

	private int[] theArray;
	private int arraySize;
	private int itemsInArray = 0;
	static long startTime;
	static long endTime;
	
	public BigONotation(int size) {
		theArray = new int[size];
		arraySize = size;
	}
	
	public static void main(String[] args) {
		BigONotation testAlgo1 = new BigONotation(100000);
		testAlgo1.generateRandomArray();
		
		BigONotation testAlgo2 = new BigONotation(200000);
		testAlgo2.generateRandomArray();
		
		BigONotation testAlgo3 = new BigONotation(300000);
		testAlgo3.generateRandomArray();
		
		BigONotation testAlgo4 = new BigONotation(400000);
		testAlgo4.generateRandomArray();
		
		testAlgo1.linearSearchItem(20);
		testAlgo2.linearSearchItem(20);
		testAlgo3.linearSearchItem(20);
		testAlgo4.linearSearchItem(20);
	}
	
	// O(1)
	// an algorithm that executes same amount of time regardless the amount of data
	// Paraphase: it will executes with the same amount of time no matter how big the array is
	public void addItemToArray(int newItem) {
		theArray[itemsInArray++] = newItem;
	}
	
	// O(n)
	// an algorithm that time to complete is actually going to grow in direct proportion to the amount of data
	// perfect example is the linear search, find all values that match what we are searching for. We have to look
	// exactly in each item
	public void linearSearchItem(int value) {
		boolean valueInArray = false;
		String indexsWithValue = "";
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == value) {
				valueInArray = true;
				indexsWithValue += i + " ";
			}
		}
		
		System.out.println("Value found: " + valueInArray);
		endTime = System.currentTimeMillis();
		
		System.out.println("The linear search took: " + (endTime - startTime));
	}
	
	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 1000) + 10;
		}
	}
	
}
