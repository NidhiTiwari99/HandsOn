class Car{  
void vehicle(){
    System.out.println("Car is type of Vehicle");
    }  
}  
class Suzuki extends Car{  
void brand(){
    System.out.println("Suzuki is a car brand");
    }  
}  
class Alto extends Suzuki{  
void modal(){
    System.out.println("Auto is Suzuki's Modal");
    }  
}  
class Inheritance{  
public static void main(String args[]){  
Alto a=new Alto();  
a.vehicle();  
a.brand();  
a.modal();  
}
}