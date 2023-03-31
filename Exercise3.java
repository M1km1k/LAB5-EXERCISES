public class Exercise3{

private int number;

public Exercise3(int number){

this.number = number;

}

public int getnumber(){

return this.number;

}

public int counter(int number){

for(int i = 1; i <= number; i++){

for(int j = 1; j <= number; j++){

System.out.print(j+"\n");

}

System.out.print("");

}

return getnumber();

}

public void main(){

counter(number);

}


}