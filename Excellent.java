class Excellent{
public void student(){
System.out.println("Students score above 90 got A+ grade");
  }
}
class Very_Good extends Excellent{
public void student(){
System.out.println("Students score 80-90 got A grade");
  }
}
class Average extends Very_Good{
public void student(){
System.out.println("Students score 70-80 got B+ grade");
  }
}
public class Myclass{
public static void main(String args[]){
Excellent E = New Excellent();
Excellent F = New Very_Good();
Excellent G = New Average();
E.student();
F.student();
G.student();
    }
}