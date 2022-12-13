import java.util.*;
class   Tushar{
  void A1(){System.out.println("function A1");}
  void A2(){}
  void A21(){}
  void A13(){}

}

  
class Test{  
 /*  void printName(Object obj){      
  Class c=obj.getClass();    
  System.out.println("name :"+c.getName());    // prints name of rhe class whose object is paseed as arguments 
  } 
  */ 
  public static void main(String args[]){  
   Tushar s=new Tushar ();  
   // class "Class" has no constructor so a static method is used to create instance of class "Class" . 
   Class myclass=s.getClass();   
   System.out.println("name of class :"+myclass.getName());     // get name of class by instance 
   // object.getDeclaredMethods() gives all the methods decalred in the Tushar class 

   
   System.out.println("declared method of my class :"+Arrays.toString(myclass.getDeclaredMethods()));


   

 }  
}  
   