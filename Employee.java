
package lab1;


public class Employee 
{
.
	
    public Employee(String name, String position, int salary)
    {
        ID_number = IDCounter;
        e_name = name;
        e_position = position;
        e_salary = salary;        
        ++IDCounter;
    }
    
    public Employee(String name, String position)
    {
        this(name, position, 6000);
        if (position.equalsIgnoreCase("worker")) {e_salary = 5000;}
    }
    
    public Employee(String name)
    {
        this(name, "worker");
    }
    
    public void PrintEmployee()
    {
        System.out.println(  "ID: "         + ID_number
                           + "; Name: "     + e_name
                           + "; Position: " + e_position 
                           + "; Salary: "   + e_salary
                           + ";");
    }
    
    public static void PrintEmployees(Employee employees[])
    {
        if (employees.length != 0)
        {
            int sumSalary = 0, maxSalary = 0, id_s = -1;
            
            for (int i = 0; i < employees.length; ++i)
            {
                employees[i].PrintEmployee();
                sumSalary += employees[i].e_salary;
                
                if (maxSalary < employees[i].e_salary)
                {
                    maxSalary = employees[i].e_salary;
                    id_s = i;
                }
            }
            
            System.out.println("Sym salary: " + sumSalary);
            System.out.println("position: " + employees[id_s].e_position
                           + "; Salary: " + employees[id_s].e_salary 
						   + ";");
        }
    }
    
    private static int IDCounter = 1;
    private int ID_number;
    private String e_name;
    private String e_position;
    private int e_salary;
    
}
