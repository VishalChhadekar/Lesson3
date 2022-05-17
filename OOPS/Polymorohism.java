package lessionThree.OOPS;


class Circle{
	public void area() {
		System.out.println("Area of circle");
	}
}
class Rectangle{
	public void area() {
		System.out.println("Area of circle");
	}
}
class Square{
	public void area() {
		System.out.println("Area of circle");
	}
}
class Geometry{
    void usage(Shapes s) {
        s.getData();
        s.calculate();
        s.disp();
    }
}
 class Polymorohism {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle rc = new Rectangle();
        Square sq = new Square();
        
//        Shapes s;
//        
//        s=c;//s= (address of the object which is pointed by c)
//        
//        s.getData();//overridden method
//        s.calculate();//overridden method
//        s.disp();//inherited method
//        
//        s=rc;//s= (address of the object which is pointed by rc)
//        s.getData();//overridden method
//        s.calculate();//overridden method
//        s.disp();//inherited method
//        
//        s=sq;//s= (address of the object which is pointed by sq)
//        s.getData();//overridden method
//        s.calculate();//overridden method
//        s.disp();//inherited method
        Geometry g =new Geometry();
        g.usage(c);
        g.usage(sq);
        g.usage(rc);
    }
}

