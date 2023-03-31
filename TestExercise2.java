import java.util.*;

public class TestExercise2{

public static void main(String [] args){

int first;
int second;
int choose;

Scanner get = new Scanner(System.in);

System.out.print("***************************\n");
System.out.print("* LABORATORY 5 EXERCISE 2 *\n");
System.out.print("***************************\n");

System.out.print(" Enter your first number : ");
first = get.nextInt();

System.out.print(" Enter your second number: ");
second = get.nextInt();

System.out.print("\n***************************\n");
System.out.print("*   OPERATION SELECTIONS  *\n");
System.out.print("*Press '1' to ADD         *\n");
System.out.print("*Press '2' to SUBTRACT    *\n");
System.out.print("*Press '3' to MULTIPLY    *\n");
System.out.print("*Press '4' to DIVIDE      *\n");
System.out.print("***************************\n");

System.out.print("\n***************************\n");
System.out.print("\n Choose Your OPERATION: ");
choose = get.nextInt();

Exercise2 e = new Exercise2 (first, second, choose);
e.main();


}


}