package lessionThree.AssistedProject;

/*
 * Java does not support multiple inheritance, because, if two class having method of same name, it creates ambiguity
 * Thus, to resolve it, we use interface.
 * With the help of interface, we can implement a class by extending more than one interfaces, this allow use to 
 * implement multiple inheritance.
 * A default method is similar to abstract method, which is present in the interface. 
 * we don;t need to override this method seperatly, because it is already implemented in the each interface.
 */

interface interfaceOne {
	public default void display() {
		System.out.println("display() method of interface one");
	}
}

interface interfaceTwo {
	public default void display() {
		System.out.println("display() method of interface two");
	}
}

class Diamand implements interfaceOne, interfaceTwo { // doing so, we can implement both interfaces at the same time
	public void display() {
		interfaceOne.super.display(); // calling parent class method using super keyword from child class.
		interfaceTwo.super.display();
	}
}

public class DiamondProblem {
	public static void main(String args[]) {
		Diamand d = new Diamand();
		d.display();
	}

}
