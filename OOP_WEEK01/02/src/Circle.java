public class Circle{
	private double radius;
	private String color;
	private double area;

	public double getRadius(){
		return this.radius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}

	public void setRadius(double radius){
		this.radius=radius;
	}
	
	public void setColor(String color){
		this.color=color;
	}

	public String getColor(){
		return this.color;
	}	

	
	public Circle(){
		this.radius=1;
		this.color="blue";
	}
	
	public Circle(double r){
		this.radius=1;
		this.color="blue";
	}

	public Circle(double radius,String color){
		this.radius=1;
		this.color="blue";

	}

	

	
	
}