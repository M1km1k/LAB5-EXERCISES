import java.lang.Character.*;
import java.lang.Math.*;

public class Exercise1{

private String first;
private String second;

private double num1;
private double num2;

public Exercise1(String first, String second, double num1, double num2){

this.first  = first;
this.second = second;
this.num1   = num1;
this.num2   = num2;

}

public String getfirst(){

   return this.first;

}

public String getsecond(){

   return this.second;

}

public double getnum1(){

   return this.num1;

}

public double getnum2(){

   return this.num2;

}

public void display(){

   System.out.printf("\nThe uppercase of %s is: %s\n",getfirst(),getfirst().toUpperCase());

   System.out.printf("The lowercase of %s is: %s\n",getsecond(),getsecond().toLowerCase());

   System.out.printf("Math.sqrt (%.0f)= %.1f\n",getnum1(),Math.sqrt(getnum1()));

   System.out.printf("Math.sqrt (%.0f)= %.1f\n",getnum2(),Math.sqrt(getnum2()));

}




}