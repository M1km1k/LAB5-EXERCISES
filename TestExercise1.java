import java.util.*;

public class TestExercise1{

public static void main(String [] args){

String first;
String second;
double num1;
double num2;

Scanner get = new Scanner(System.in);

System.out.print("Input a first letter: ");
first = get.nextLine();
System.out.print("Inpt a second letter: ");
second = get.nextLine();

System.out.print("Enter a first digit : ");
num1 = get.nextDouble();
System.out.print("Enter a second digit: ");
num2 = get.nextDouble();

Exercise1 e = new Exercise1(first, second, num1, num2);
e.display();


}


}