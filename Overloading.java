class Overloading{  
  void sum(int a,int b){
    System.out.println("int arg method invoked");
    }  
  void sum(long a,long b){
    System.out.println("long arg method invoked");
    }  
  
  public static void main(String args[]){  
  Overloading ol=new Overloading();  
  ol.sum(20,20);
  }  
}  