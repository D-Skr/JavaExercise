package main;

//creating my own collection, which imitates ArrayList<String>

public class MyArrayList {
	private String[] array = new String[10];
	private int size = 0;
	
	//add element and resize array size if it is full
	public void add(String s) {
		array[size] = s;
		size++;
		if (size == array.length) {
			String[] newArray = new String[array.length*2]; //double size of array
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i]; //copy old array to new one
			}
			array = newArray; //copy new doubled array to old one
		}
	}
	
	//remove by index of element
	public void remove(int index) {
		if (index >= 0 && index < size) {
			for (int i = index; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
		size--;
		}
	}
	
	//remove by value of element
	public void remove(String s) {
		int index = -1;
		for (int i = 0; i < size; i++) {
			if (s.contentEquals(array[i])) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			remove(index);
		}
	}

	public int getSize() {
		return size;
	}

	//get element by index
	public String get(int index) {
		if (index >= 0 && index < size) {
			return array[index];
		} else return "not found";
	}
	
	
	public static void main(String[] args) {
		MyArrayList employees = new MyArrayList();
		employees.add("John");
		employees.add("Bob");
		employees.add("Jack");
		employees.add("Dasy");
		employees.add("Mary");
		employees.add("Moe");
		for (int i = 0; i < employees.getSize(); i++)
			System.out.println(employees.get(i));
			System.out.println("~~~~~~~");
		
		for(int i = 1; i <= 10; i++) 
			employees.add("Employee " + i);
		
		employees.remove(0);
		
		employees.remove("Bob");
		
		for (int i = 0; i < employees.getSize(); i++)
			System.out.println(employees.get(i));
	}
	
}
