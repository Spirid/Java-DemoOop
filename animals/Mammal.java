
package lab1.animals;

public abstract class Mammal extends Animal
{
    Mammal(String name, String type, String soundType)
    {
        super(name, type);
        m_soundType = soundType;
    }
        
    @Override public String moves() {return "run";}     
    @Override public String Sound() {return m_soundType;}
    
    private String m_soundType;
}
