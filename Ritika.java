class Dadaji{
public void radio(){
System.out.println("I want dadaji's radio");
}
}
class Papaji extends Dadaji{
public void laptop(){
System.out.println("I want papa's laptop");
}
}
class Ritika extends Papaji{
public void study(){
System.out.println("I want to listen song and study");
}
public static void main(String args[]){
Ritika r = new Ritika();
r.radio();
r.laptop();
r.study();
}
}

