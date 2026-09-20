/* wrapper class-
   we can never say that java is a fully object oriented language if we are using primitive datatypes,wrapper class in java is used to convert primitve data type to class 
   int --> Integer
   double --> Double 
   Float --> Float 
*/

public class wrapper
{
    public static void main(String[] args) {
        int a=1;
        System.out.println("primitive datatype "+a);

        Integer a1=Integer.valueOf(1);
        System.out.println("wrapper class "+a1);

        //Boxing: Converting primitve datatype to corresponding wrapper class.
        //Autoboxing:Automatically converting primitve datatype to corresponding wrapper class by the   compiler.
        int n1=23;
        Integer n2=n1; //Autoboxing
         System.out.println("example of boxing "+n2);
        Integer n3=Integer.valueOf(n1); //boxing
        System.out.println("another way of boxing "+n3);


        //Unboxing: Converting wrapper class to primitve datatype.
        //Autounboxing:Automatically converting wrapper class to primitve datatype by the compiler.

        Integer x1=Integer.valueOf(55);
        int x4=x1; //Autounboxing
        System.out.println("example of unboxing "+x4);
        int x3=x1.intValue(); //unboxing
        System.out.println("another way of unboxing "+x3);





    }

}