package lessionThree.Threads;

class Employee{
	public void display() {
		System.out.println("display");
	}
	
	public void print(int age) {
		System.out.println("Employee");
		
	}
}

class Person extends Employee{
	
	public void display(String name) {
		System.out.println(name);
	}
	public int print(int age) {
		System.out.println("Trianne ");
		return age;
	}
	public static void main(String args[]) {
		Person trianne = new Person();
		trianne.display();
		trianne.display("Bob");
		trianne.print(10);
		
	}
}
