class Employee{  
   int id;
   String name;  
   static String Company ="TCS";//static variable   
   Employee(int r, String n){  
   id = r;  
   name = n;  
   }    
   void display (){
    System.out.println(rollno+" "+name+" "+college);
    }  
}  
public class TestStaticVariable{  
 public static void main(String args[]){  
 Employee e1 = new Employee(1,"Nidhi");  
 Employee e2 = new Employee(2,"Piyush");   
 e1.display();  
 e2.display();  
 }  
}  