class Maths{
      public int operator(int a, int b){
      return(a+b);
      }
     public float operator(float a, float b){
     return(a-b);
      }
   
     public int operator(int a, int b, int c){
      return(a*b*c);
      }
        
     public double operator(double a, double b){
      return(a/b);
      }
        
public static void main(String args[]){ 
Maths m = new Maths();
System.out.println(m.operator(12, 34));
System.out.println(m.operator(18.9, 54.78));
System.out.println(m.operator(112, 90, 67));
System.out.println(m.operator(111.2, 8.90));
}
}