class car{
public void fast(){
System.out.println("My car is very slow");
//sum
}
}
class BMW extends car{
public void fast(){
System.out.println("My car is very fast");
//multi
}
}
public class mylife{
public static void main(String args[]){
car c = new car();
car b = new BMW();

c.fast();
b.fast();
}
}
//method overriding