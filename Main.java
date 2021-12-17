package main;

public class Main {

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
