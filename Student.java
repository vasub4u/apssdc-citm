class Student extends Person
{
     String Program;
	 int Year;
     double Fee;
 
     Student(String name, String address,String program, int year, double fee)
     {
          super(name,address);
		  Program = program;
          Year = year;          
          Fee = fee;         
      }
     void Display()
     {
            super.Display();

            System.out.println("Program : " + Program);
            System.out.println("Year : " + Year);
            System.out.println("Fee : " + Fee);
     }
}