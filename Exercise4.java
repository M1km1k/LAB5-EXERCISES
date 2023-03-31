import java.util.*;
import java.lang.Math.*;

public class Exercise4{

static int maxNum(int first, int second){

System.out.printf("\n Maximum number : %d",Math.max(first, second));

return Math.max(first,second);

}

static double maxNum(double third, double fourth){

System.out.printf("\n Maximum number : %.2f",Math.max(third, fourth));

return Math.max(third, fourth);

}


public static void main(String [] args){

int first;
int second;

double third;
double fourth;

int select;

Scanner get = new Scanner(System.in);
System.out.print("                   LAB5_EXERCISE4                 \n");
System.out.print("               MAXIMUM OF TWO NUMBERS             \n");
System.out.print("**************************************************\n");
System.out.print("* Press '1' for inputing an Integer Value        *\n");
System.out.print("* Press '2' for inputing an Double  Value        *\n");
System.out.print("* Press '3' for inputing both Integer and Double *\n");
System.out.print("* Press '4' to  QUIT                             *\n");
System.out.print("**************************************************\n");

System.out.print("\n* Select a Type: ");
select = get.nextInt();

if(select == 1){ 

System.out.print("\n* Enter first Integer number : ");
first = get.nextInt();

System.out.print("* Enter second Integer number: ");
second = get.nextInt();

maxNum(first,second);

}

else if(select == 2){

System.out.print("\n* Enter first Double number : ");
third = get.nextDouble();

System.out.print("* Enter second Double number: ");
fourth = get.nextDouble();

maxNum(third,fourth);

}

else if(select == 3){

System.out.print("\n* Enter first Integer number : ");
first = get.nextInt();

System.out.print("* Enter second Integer number: ");
second = get.nextInt();

System.out.print("* Enter first Double number  : ");
third = get.nextDouble();

System.out.print("* Enter second Double number : ");
fourth = get.nextDouble();

maxNum(first,second);
maxNum(third,fourth);

}

else if (select == 4){

System.out.print("* END OF PROGRAM")

}

else{

System.out.print("* Not Valid! *");

}

}


}