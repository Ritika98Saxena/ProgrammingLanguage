class Engineering{
     public void Computer_Science_Engineering(){
     System.out.println("CS is very acha");
      }
  }
class Mechanical_Engineering extends Engineering{
    public void engineer(){
    System.out.println("ME is just ok type");
      }
  }
class Electrical_Engineering extends Engineering{
    public void ME_Engineer(){
    System.out.println("EE is just ainvyi");
       }
  }  
class Electronics_Engineering extends Engineering{
    public void ComputerScience_Engineer(){
    System.out.println("EEE is just ainvyi");
      }
  } 
class Rit{ 
   public static void main(String args[ ]){
    Mechanical_Engineering ME = new Mechanical_Engineering();
    Electrical_Engineering EE = new Electrical_Engineering();
    Electronics_Engineering EEE = new Electronics_Engineering();
    ME.engineer();
    EE.ME_Engineer();
    EEE.ComputerScience_Engineer();
     }
  }