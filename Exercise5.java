import java.lang.Math.*;

public class Exercise5{

//Circle
private double r;

//Rectangle
private int Length;
private int Width;

//Triangle

private double Base;
private double Height;

private int Area;

//Circle

public Exercise5(double r){

this.r = r;

}

// Circle

public double getr(){

return this.r;

}

static double RadiusOfCircle(double r){

double Area = Math.PI * r * 2;

System.out.printf("\nThe area of a Circle %.0f is %d",r,(int)Area);

return (double) Math.PI * r * 2;

}

//Rectangle

public Exercise5(int Length, int Width){

this.Length = Length;
this.Width = Width;

}

// Rectangle

public int getLength(){

return this.Length;

}

public int getWidth(){

return this.Width;

}


static int AreaOfRectangle(int Length, int Width){

int Area = Length * Width;

System.out.printf("\nThe area of a Rectangle of %d and %d is: %d",Length,Width,Area);

return Length * Width;


}

//Triangle

public Exercise5(double Base, double Height){

this.Base = Base;
this.Height = Height;

}

//Triangle

public double getBase(){

return this.Base;

}

public double getHeight(){

return this.Height;

}


static double AreaOfTriangle(double Base, double Height){

double Area = Base * Height * (double)0.5;

System.out.printf("\nThe area of a Triangle of %d and %d is: %d",(int)Base,(int)Height,(int)Area);

return Base * Height * 0.5;

}



}