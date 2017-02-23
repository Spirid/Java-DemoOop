
package lab1.animals;

public abstract class Animal 
{
    
    Animal(String name, String type)
    {
        a_name = name;
        a_type = type;
    }
    abstract public String moves();
    abstract public String Sound();
    
    final public void output()
    {
        System.out.print("Name: " + a_name + "; " + "Type:" + a_type + "; ");
    }
    
    private String a_name;
    private String a_type;
}
