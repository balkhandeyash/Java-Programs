class Student2
{  
    int id;  
    String name;    
    Student2(int i,String n)
    {  
    id = i;  
    name = n;  
    }  
   
    void display(){System.out.println(id+" "+name);
    
}  
   
class Prac3
{
    public static void main(String args[])
    {  
    //creating objects and passing values  
    Student2 s1 = new Student2(111,"Karan");  
    Student2 s2 = new Student2(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  