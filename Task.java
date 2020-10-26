import java.util.Scanner;
class Task{
public static void main(String args[]){
Scanner s = new Scanner(System.in);



System.out.println("Enter name");
String Name = s.nextLine();
System.out.println("My name is:"+Name);

System.out.println("Enter your address");
String Addrs = s.nextLine();
System.out.println("My address is:"+Addrs);


System.out.println("Enter age");
int Age = s.nextInt();
System.out.println("My age is:"+Age);


System.out.println("Enter your pin");
int pin = s.nextInt();
System.out.println("My pin is:"+pin);


}
}