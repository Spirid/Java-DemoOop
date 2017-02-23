
package lab1.animals;

public class Fish extends Animal 
{
    public Fish(String name)
	{
	super(name, "Fish");
	}
    
    @Override public String moves() 
	{
	return "swim";
	}
	
    @Override public String Sound() 
	{
	return "nothing";
	}    
}
