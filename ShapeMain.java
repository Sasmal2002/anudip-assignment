package LabTest2;

public class ShapeMain {

	public static void main(String[] args) {
		//create an object of the area class 
		Area area=new Area();
		
		
		//call the rectangleArea method
		area.rectangleArea(5.0,6.0);
		
		//call the squareArea method
		area.squareArea(0.5);
		
		//call the circleArea method
		area.circleArea(5.0);

	}

}
