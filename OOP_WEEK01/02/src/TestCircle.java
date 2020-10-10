public class TestCircle{
	public static void main(String[] args){
		Circle c1=new Circle();
		Circle c2=new Circle(8);
		Circle c3=new Circle(10,"blue");

		c1.setRadius(10);
		c1.setColor("blue");

		System.out.println("The radius is : "+c1.getRadius()+" and area is "+c1.getArea()+" color of "+c1.getColor());
		System.out.println("The radius is : "+c2.getRadius()+" and area is "+c2.getArea()+" color of "+c2.getColor());
	
		
	}
}