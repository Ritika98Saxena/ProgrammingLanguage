package A;
class dog{
private/public/protected void eat(){
System.out.println("Suraj is programmer");
}
}
package B;
import A.*;//importing all classes in package A
class cat{
public static void main(String[] args){
dog d = new dog();
d.eat();
}
}