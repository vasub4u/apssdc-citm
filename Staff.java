class Staff extends Person
{
      String School;
      double Pay;
     
 
     Staff(String name, String address, String school, double pay)
     {
          super(name,address);
          School = School;
          Pay = pay;    
     }
     void Display()
     {
            super.Display();

            System.out.println("School : " + School);
            System.out.println("Pay : " + Pay);
            
     }
}