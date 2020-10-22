class Bank{
        private int amount;
        private String noofcustomer;
        private int CVVno;

        public int getmoney(){
        return amount;
        }
        public String getname(){
        return noofcustomer;
        }
        public int getcv(){
        return CVVno;
        }
        public void setmoney(int a){
       amount = a;
}
public void setname(String a){
noofcustomer = a;
}
public void setcv(int a){
CVVno =a;
}
}
public class HelloBank{
public static void main(String args[]){
Bank b = new Bank();
b.setmoney(1000);
b.setname("Ritika");
b.setcv(10);
System.out.println("Total money in the bank"+b.getmoney());
System.out.println("Customer name is" +b.getname());
System.out.println("CVV no is "+b.getcv());
}
}