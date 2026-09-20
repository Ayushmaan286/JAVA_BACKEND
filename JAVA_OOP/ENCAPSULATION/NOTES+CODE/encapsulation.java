class learner
{
    private int id;
    private String name;
    private String School;
   // this keyword is used to differentiate between the two parameters,this keyword refers to the current object that means [this.id] means id is the variable of object .

   //if we dont make these keywords private then these can be accessed by anyone 
   // now if we have made them private then no one outside this class can access these data members
   //so for giving values we use getter]
   //for printing the giving values we use the setter function 
    void setid(int id)
    {
        this.id=id;

    }//setter function
    void setname(String name)
    { 
        this.name=name;
    }//setter function
    void setSchool(String School)
    {
        this.School=School;

    }

    //getter function
    int getid()
    {
        return id;
    }//getter function
    String getname()
    {
        return name;
    }// getter function 
    String getSchool()
    {
        return School;
    }

}
 class encapsulation
{
    public static void main(String[] args)
    {
        learner obj = new learner();
        // obj.id=-10;
        // System.out.println(obj.id);
        // anyone can access this variable and easily manipulate it if the variable id,name,school are public/friendly

        obj.setid(8);
        obj.setname("ayushmaan");
        obj.setSchool("UPKSSV");

        System.out.println("id is "+obj.getid());
        System.out.println("name is "+obj.getname());
        System.out.println("school  is "+obj.getSchool());








    }
}