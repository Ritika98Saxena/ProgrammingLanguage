class RBI{
public void ROI(){
System.out.println("This is RBI and  I am introducing ROI to all bank");
}
class Axis extends RBI{
public void ROI(){
System.out.println("Axis Bank ROI is 11.99%");
}
}
class Union extends RBI{
public void ROI(){
System.out.println("Union Bank ROI is 12.09%");
}
}
class ICICI extends RBI{
public void ROI(){
System.out.println("ICICI Bank ROI is 5%");
}
}
 class Banks{
public static void main(String args[] ){
RBI R = new RBI();
Axis A = new Axis();
Union U = new Union();
ICICI I = new ICICI();
}
}