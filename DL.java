import java.util.Scanner;
class DL{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter age");
int dl = sc.nextInt();
if (dl>=18){
System.out.println("You are eligible for DL");
}
else
{
System.out.println("You are not eligible for DL");
}
}
}