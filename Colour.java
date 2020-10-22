class Tree{
String tree = "Mango_tree";
public void root(){
System.out.println("I love apple");
}
}
class Leaves extends Tree{
String leaves = "Mulberry_Leaves";
public void branch(){
System.out.println("Favorite color Black");
}
}
class Fruit extends Leaves{
String fruit = "Mango";
public void Blueberry(){
System.out.println("Favorite food chinese");
}
}
class Colour extends Fruit{
String colour = "Purple";
public void Blue(){
System.out.println("Favorite food chinese");
}
public static void main(String args[]){
Colour c = new Colour();
c.root();
c.branch();
c.Blueberry();
c.Blue();
System.out.println(c.tree);
System.out.println(c.fruit);
System.out.println(c.colour);
System.out.println(c.leaves);
}
}