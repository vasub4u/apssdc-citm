class StaffStd
{
       public static void main(String args[])
       {
               Person pObj = new Person("Uma Mahesh","Visakhapatanam");
               Student sObj = new Student("Srinivas","Visakhapatanam","ANDROID FTP",2016,5000.23);
               Staff tObj = new Staff("Akash-Sinha ","Delhi","CITM",60000);
               System.out.println("Person :");
               pObj.Display();
               System.out.println("");
               System.out.println("Student :");
               sObj.Display();
               System.out.println("");
               System.out.println("Staff :");
               tObj.Display();
        }
}