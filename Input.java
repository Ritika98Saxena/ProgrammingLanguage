import java.util.Scanner;
class Input{
public static void main(String args[]){
Scanner a = new Scanner(System.in);
System.out.println("What is your name?");
String s = a.nextLine();
System.out.println("My name is :"+s);
System.out.println("What is your college roll no?");
int r = a.nextInt();
System.out.println("My college roll no is"+r);
}
}