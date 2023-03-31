import java.util.*;
import java.lang.Math.*;

public class TestExercise5{

public static void main(String [] args){

double r;

int Length;
int Width;

double Base;
double Height;

int Select;

Scanner get = new Scanner(System.in);

System.out.print("**************************************************\n");
System.out.print("*            LAB 5 EXERCISE 5                     \n");
System.out.print("* Press '1' to Calculate the Area of a Circle    *\n");
System.out.print("* Press '2' to Calculate the Area of a Rectangle *\n");
System.out.print("* Press '3' to Calculate the Area of a Triangle  *\n");
System.out.print("* Press '4' to Quit                              *\n");
System.out.print("**************************************************\n");

System.out.print("Select a number: ");
Select = get.nextInt();

if(Select == 1){

System.out.print("\nRadius of a Circle: ");
r = get.nextDouble();

Exercise5 e = new Exercise5(r);
e.RadiusOfCircle(r);

}

else if(Select == 2){

System.out.print("\nLength of a Rectangle: ");
Length = get.nextInt();

System.out.print("Width of a Rectangle : ");
Width = get.nextInt();

Exercise5 f = new Exercise5(Length, Width);

f.AreaOfRectangle(Length, Width);

}

else if(Select == 3){

System.out.print("\nBase of a Triangle  : ");
Base = get.nextInt();

System.out.print("Height of a Triangle: ");
Height = get.nextInt();

Exercise5 g = new Exercise5(Base, Height);

g.AreaOfTriangle(Base, Height);

}

else if(Select == 4){

}

else{

System.out.print("\nINVALID!");

}


}


}