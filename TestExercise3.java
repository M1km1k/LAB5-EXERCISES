import java.util.*;

public class TestExercise3{

public static void main(String [] args){

int number;

Scanner get = new Scanner(System.in);

System.out.print("Enter a number: ");
number = get.nextInt();

Exercise3 e = new Exercise3(number);
e.main();

}

}