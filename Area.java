package LabTest2;

public class Area implements Shape{
//implementation of the rectangleArea method
	@Override
	public void rectangleArea(double length, double breadth) {
		System.out.println("Area of Rectangle:"+(length*breadth));
		
	}
////implementation of the squareArea method
	@Override
	public void squareArea(double side) {
		System.out.println("Area of Square:"+(side*side));
		
	}
//implementation of the circleArea method
	@Override
	public void circleArea(double radius) {
	System.out.println("Area of circle:"+(Math.PI*radius*radius));
		
	}

	

}
