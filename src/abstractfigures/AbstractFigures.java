package abstractfigures;
/*
 * program to find the area and perimeter of 3 Figures using Abstract classes and methods
 */

abstract class Figure//abstract class with abstract methods
{
	double dim1;
	abstract void findArea();//abstract findArea() method with no body
	abstract void findPerimeter();//abstract findPerimeter() method with no body
}
class Circle extends Figure//Child class Circle 
{
	double radius=5;
	void findArea()// defining body of findArea() for Circle Class
	{
		// TODO Auto-generated method stub
		dim1 = Math.PI * radius * radius;//Formula of Area of Circle
		System.out.println("Area of Circle -->"+dim1);
	}
	void findPerimeter() // defining body of findPerimeter() for Circle Class
	{
		// TODO Auto-generated method stub
		dim1=2*Math.PI*radius;//Formula of Perimeter of Circle
		System.out.println("Perimeter of Circle -->"+dim1);
	}
}
class Rectangle extends Figure//Child class Rectangle
{
	double length=70;
	double breadth=20;
	void findArea()// defining body of findArea() for Rectangle Class
	{
		// TODO Auto-generated method stub
		dim1 = length*breadth;//Formula of Area of Rectangle
		System.out.println("Area of Rectangle -->"+dim1);
	}
	void findPerimeter() // defining body of findPerimeter() for Rectangle Class
	{
		// TODO Auto-generated method stub
		dim1=2*(length + breadth);//Formula of perimeter of Rectangle
		System.out.println("Perimeter of Rectangle -->"+dim1);
	}
}
class Triangle extends Figure//Child Class Triangle
{
	double base=50;
	double height=15;
	double aside=12;
	double bside=13;
	void findArea()// defining body of findArea() for Triangle Class
	{
		// TODO Auto-generated method stub
		dim1 = (base*height)/2;//Formula for Area of Triangle
		System.out.println("Area of Triangle -->"+dim1);
	}
	void findPerimeter() // defining body of findPerimeter() for Triangle Class
	{
		// TODO Auto-generated method stub
		dim1=base+aside+bside;//Formula of Perimeter of Triangle
		System.out.println("Perimeter of Triangle -->"+dim1);
	}
}
public class AbstractFigures 
{
	public static void main(String[] args) //Start of Main Class
	{
		// TODO Auto-generated method stub
		Rectangle rect =new Rectangle();//Creating object of Rectangle Class
		Circle cir =new Circle();//Creating object of Circle Class
		Triangle tria= new Triangle();	//Creating object of Triangle Class
		rect.findArea(); //Call to findArea() of Rectangle Class
		rect.findPerimeter();//Call to findPerimeter() of Rectangle Class
		cir.findArea();//Call to findArea() of Circle Class
		cir.findPerimeter();//Call to findPerimeter() of Circle Class
		tria.findArea();//Call to findArea() of Triangle Class
		tria.findPerimeter();//Call to findPerimeter() of Triangle Class

	}//Close of Main Class
}
