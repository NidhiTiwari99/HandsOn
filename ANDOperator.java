public class ANDOperator{  
public static void main(String args[]){  
int a=20;  
int b=10;  
int c=40;  
System.out.println(a<b&&a++<c);//false && true = false  (it will check 2nd condition only when 1st will be true)
System.out.println(a);//10 because second condition is not checked  
System.out.println(a<b&a++<c);//false && true = false  (it will check both the condition either 1st one is true or false)
System.out.println(a);//11 because second condition is checked  
}
}