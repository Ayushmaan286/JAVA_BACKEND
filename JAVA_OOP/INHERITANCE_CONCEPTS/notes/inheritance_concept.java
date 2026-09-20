package INHERITANCE_CONCEPTS.notes; 
/* inheritance : a class inherites the properties of another class 
types:-
single level: parent class --> child class 
multi level : parent class--> child/parent class --> child class
multiple children : parent class --> child class <-- parent class (not allowed )
                     class car extends maruti,suzuki (not allowed)
                     for eg if both parent class has variable i with different values then what value does the child gets

--> no multiple inheritance (multiple inheritance can be achieved by interfaces)

--> a private member of a class cant be inherited by another class  

--> a class by default exntends object class 
 eg: class car  // extends object 
    

 */

public class inheritance_concept {
    public static void main(String[] args) {
        zebra obj = new zebra();
        obj.print();
    }
}

 class animal 
{
    animal()
    {
        System.out.println("default constructior for animal class");
    }
} 

 class zebra extends animal 
{
    /*zebra()
    {
     super(); // this invoked the default constructor of animal class
    } */
    
    void print()
    {
        System.out.println("inside zebra class");
    }
} 
/*in this code i have called zebra function but its constructor also gets executed , so that means the constructor of the parent class is also inherited  THE STRAIGHT FORWARD ANSWER IS NO. THE CONSTRUCTOR CAN NEVER BE INHERITED 
it is possible because the compiler would create a default constructor for zebra class when there is no constructor present 
and whenever a constructor is made its first line is super function call.

-->super(): this function call calls the constructor of the parent class 

-->EXCEPTION - if this() function is called at the start of the constructor then super() is not added by the compiler 

-->EITHER this() OR super() METHOD WILL BE PRESENT IN A CONSTRUCTOR .

--> super (keyword):- it is used to refer to any member of the parent class.
     eg. super.i; it will use the the value of i present in parent class.


--> INHERITED METHOD:methods that are inherited from the parents and are implemented as it is in the child class
--> OVER RIDDEN METHOD: methods in which changes are made after they are inherited from the parent class
--> SPECIALISED METHOD: not inherited from the parent they are only present in child class to serve a special purpose.



--> parent class - plane
--> child class - airplane 
--> in this we can create object of child in two ways 
     airplane obj1=new airplane(); //any method from the parent or child class can be called using the instance
     plane obj2=new airplane(); //only the methods present in the parent class(plane) can be called

     --> upcasting :- creating parent named reference for child type instance


--> STATIC METHODS CAN BE INHERITED BUT THEY CANT BE OVERRIDDEN (METHOD HIDING)
    whenever we try to over ride static method in child class it will hide the parent class static method it will behave like a specialised method of child class .



--> final keyword:- it can be applied to a class, variable, method  . 
                    final class can't be inherited
                    final method can be inherited 
                    final method can't be overrided

--> FINAL AND STATIC METHODS IN JAVA CAN BE INHERITED BUT CAN'T BE OVERRIDEN 
--> PRIVATE METHOD CAN'T BE INHERITED SO NO CHANCE OF OVERRIDING .

*/


