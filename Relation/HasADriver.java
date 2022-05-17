package lessionThree.Relation;

//Composite Object
class Heart {
	int beat;
	String blood_color;

	public Heart(int beat, String blood_color) {
		super();
		this.beat = beat;
		this.blood_color = blood_color;
	}

	public int getBeat() {
		return beat;
	}

	public String getBlood_color() {
		return blood_color;
	}

}

//Aggregate Object
class Mobile {
	int cost;
	String company;

	public Mobile(int cost, String company) {
		super();
		this.cost = cost;
		this.company = company;
	}

	public int getCost() {
		return cost;
	}

	public String getCompany() {
		return company;
	}

}

//Main Object
class Bheemesh {
	Heart h = new Heart(72, "Dark Red");

	void hasMobile(Mobile m) {
		System.out.println(m.getCompany());
		System.out.println(m.getCost());
	}
}

public class HasADriver {
	public static void main(String[] args) {
		Bheemesh b = new Bheemesh();
		Mobile mb = new Mobile(80000, "Apple");
		System.out.println(b.h.getBeat());
		System.out.println(b.h.getBlood_color());
		b.hasMobile(mb);

		b = null;
		// System.out.println(b.h.getBeat());//NullPointerException
		// System.out.println(b.h.getBlood_color());

		/*
		 * The relation between mobile and Bheemesh is Composition (Heart is part of
		 * Bheemesh), though Bheemesh does not exist (set to Null) we cannot access
		 * Heart's member data, because Bheemesh and Heart is tightly bound
		 */

		System.out.println(mb.getCompany());
		// The relation between mobile and Bheemesh is Aggregation, though Bheemesh does
		// not exist (set to Null)
		// we can access mobile's member data, Mobile and Bebmesh is loosely bound
		System.out.println(mb.getCost());
	}
}