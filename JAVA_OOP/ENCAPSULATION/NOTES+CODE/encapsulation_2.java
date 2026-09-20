
/*this.variable_name - is primarily used to refer to the current object but it can also be used to differentiate between instance varibale and global variable 

this()- we can call multiple constructor using a single instance , this() function call allows us to call a constructor inside another constructor
*/
class encapsulation_2
{
    private int id;
    private String name;
    encapsulation_2()
    {
        this(1,"ayush");

    }
    encapsulation_2(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public static void main(String[] args) {
        
        encapsulation_2 obj = new encapsulation_2();
        System.out.println(obj.id+" "+obj.name);

    }
}