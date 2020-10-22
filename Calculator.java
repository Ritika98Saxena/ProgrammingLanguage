class Calculator{
public void sum(){
int a = 30,b = 20;  output= 50
int sum =a+b;
System.out.println("Sum of two number is :" +sum);
}
public void sub(){
int d=35, e= 40;
int sub= e-d;
System.out.println("Sub of two number is :" +sub);
}
private void div(){
float k=67, l= 90;
float div= k/l;
System.out.println("Division of two number is :" +div);
}
public void mul(){
int m= 335, n= 490;
int mul= m*n;
System.out.println("Mul of two number is :" +mul);
}
class mouse extend Calculator{

output =50

public static void main(String[] args){
Calculator c = new Calculator();
Calculator d = new Calculator();
System.out.println(c);
System.out.println(d);

c.sum();
c.sub();
d.div();
d.mul();

    }


}