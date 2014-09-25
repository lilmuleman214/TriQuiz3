package GeoObjects;

public class Triangle extends GeometricObject{
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	public Triangle(){
		
	}
	
	public Triangle(double s1, double s2, double s3){
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public double getSide1()
	{
		return side1;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public double getSide3()
	{
		return side3;
	}
	
	public double getArea(){
		double s = this.getPerimeter() / 2;
		double a = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return a;
	}
	
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	
	public String toString()
	{
		return "This is a triangle with sides that have a length of: " + side1 +
				"," + side2 + "," + side3 + ". Perimeter = " + this.getPerimeter() + 
				" Area = " + this.getArea() + ".";
	}
}
