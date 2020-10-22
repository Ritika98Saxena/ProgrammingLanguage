class CBSE{
String designation ="Teacher";
String lab = "Chemistry_Lab";
 public void study(){
System.out.println("My chemistry teacher name is maddy");
}
}
class DMA extends CBSE{
public static void main(String args[]){
DMA d= new DMA();
d.study();
}
}