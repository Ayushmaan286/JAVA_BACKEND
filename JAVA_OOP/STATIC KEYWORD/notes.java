
/* static keyword relates that particular thing to class

static variable : only one copy will be shared among all the object 
static function: can be executed without creating a object 
static block : a block that runs only one time 

as soon as the class is loaded in memory the static variable is given memory the static block is executed

static --> static block(used to initialize static variables)
{
}

{ --> java initialiser block (to write code that is common to all the constructor)
}

constructor() --> constructor 
{
}


as soon as class is loaded static block will be executed and memory is alotted to static variables 
then object is created java initialiser block will be executed 
then constructor is called 

so the order of execution will be 
static block --> java initialiser block -->constructor 
if again a object is created then 
java initialiser block -->constructor 

NOTE: the static block will be executed only one time when the class is loaded in memory , even if multiple objects(instances) are created class would be loaded only one time at the start that is why when the 2nd instance is created static block is not executed in the above example 


 */
public class notes {
    
}
