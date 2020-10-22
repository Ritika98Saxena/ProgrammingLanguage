class calcu{
public int multi(int a, int b){
return (a*b);
}
public double multi(double a, double b,double c){
return (a*b*c);
}
public static void main(String args[]){
calcu c = new calcu();
System.out.println(c.multi(10,20));
System.out.println(c.multi(20.5,30.1,10.28));
}
}