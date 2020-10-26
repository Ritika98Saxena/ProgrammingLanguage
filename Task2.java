
import java.util.Scanner;
public class Task2{
   public static void main(String [] args){
int i =0;
   Scanner s = new Scanner(System.in);
    System.out.println("Enter name");
    String Name = s.nextLine();
     System.out.println("My name is : "+Name);
System.out.println("Enter your marks");
    int Marks = s.nextInt();
     System.out.println("My Marks is : "+Marks);
        
             if(Marks>30){
                   System.out.println("You will pass. Congratulations!!");
                       }
             else
                      {
                   System.out.println("You will fail.. Try next time");
                      }


}
}