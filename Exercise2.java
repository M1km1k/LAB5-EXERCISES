public class Exercise2{

private int first;
private int second;
private int choose;

int add;
int subtract;
int multiply;
int divide;

public Exercise2(int first, int second, int choose){

this.first = first;
this.second = second;
this.choose = choose;

}

public int getfirst(){

return this.first;

}

public int getsecond(){

return this.second;

}

public int getchoose(){

return this.choose;

}

public int add(int first, int second){

add = first + second;

System.out.printf("%d add %d      = %d\n",first, second, add);

return getfirst() + getsecond();

}

public int subtract(int first, int second){

subtract = first - second;

System.out.printf("%d subtract %d = %d\n",getfirst(), getsecond(), subtract);

return getfirst() - getsecond();

}

public int multiply(int first, int second){

multiply = first * second;

System.out.printf("%d multiply %d = %d\n",getfirst(), getsecond() ,multiply);

return getfirst() * getsecond();

}

public int divide(int first, int second){

divide = first / second;

System.out.printf("%d divide %d   = %d\n",getfirst(), getsecond() ,divide);

return getfirst() / getsecond();

}

public void main(){

if(getchoose() == 1){

add(first,second);

} 

else if(getchoose() == 2){

subtract(first, second);

}

else if(getchoose() == 3){

multiply(first, second);

}

else if(getchoose() == 4){

divide(first, second);

}

else{

System.out.print("!Invalid Syntax!");

}

}

}