
package lab1.animals;

public class Bird extends Animal 
{
    public Bird(String name)
	{
	super(name, "Bird");
	}
    
    @Override public String moves() 
	{
	return "fly";
	}
	
    @Override public String Sound() 
	{
	return "Chirp!";
	}    
}
