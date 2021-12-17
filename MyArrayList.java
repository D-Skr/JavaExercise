package main;

public class MyArrayList {
	private String[] array = new String[10];
	private int size = 0;
	
	public void add(String s) {
		array[size] = s;
		size++;
		if (size ==array.length) {
			String[] newArray = new String[array.length*2]; //double size of array
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i]; //copy old array to new one
			}
			array = newArray; //copy new doubled array to old one
		}
	}
	

}
