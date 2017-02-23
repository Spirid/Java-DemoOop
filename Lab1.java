
package lab1;
import javax.swing.JOptionPane;
import lab1.animals.*;

public class Lab1 
{
    public static void main(String[] args)
    {
   // ExA();
   // ExB();
    ExC();
   // ExD();
    }
    public static void ExA() 
	{
        System.out.println("Lab1.Ex1");
        /*
        // Write a program that takes three int value, 
        // sort them in increase and displays. 
        // Use no more than three simple if statement. 
        // Arrays and othe collections, and else , %%, ||, 
        // and othe inticate statements not apply.
        */
		
        int  one = 0, two = 0,three = 0;
        
        try 
		{
		one    = Integer.parseInt(JOptionPane.showInputDialog("Enter int 1: "));
		two = Integer.parseInt(JOptionPane.showInputDialog("Enter int 2: "));
		three  = Integer.parseInt(JOptionPane.showInputDialog("Enter int 3: "));
        } 
		catch(NumberFormatException s)
        {
            System.out.println("In String\"" + s.getLocalizedMessage() + "\" no a number");
            System.exit(1);
        }
        
        System.out.println("Entered: " + one + "; "+ two + "; " +three +";");
        
        int tmp = 0;
        if (one > two)
		{
		tmp = two; two = one; one = tmp;
		}
        if (one >three)
		{
		tmp =three; three = one;  one = tmp;
		}
        if (two  >three)
		{
		tmp =three; three = two;  two = tmp;
		}
        
        System.out.println("Sorted: " + one + "; "+ two + "; " +three +";");
        
        System.out.println("Lab1.Ex1.end");
    }
    
    public static void ExB() 
	{
        System.out.println("Lab1.Ex2");
        /*
        // Write the following program:
        // 1. Input integer from keyboar
        // 2. In accordance with the entered number 
        //    construct a two-dimensional array of integers of the type:
        //    ☐
        //    ☐☐
        //    ☐☐☐
        //    ☐☐☐☐
        //    ☐☐☐☐☐
        //    ☐☐☐☐☐☐
        // Number of columns and rows equal to the entered integer. 
        // for example,[0][1] dose not exis.
        // 3. This two-dimensional array filled with nomberis, 
        //    inputed with keyboar.
        // 4. Array prints on the screen
        // 5. Array passed to the function, which find the element that is nearest to 10.
        // 6. The program displays the index and value of that element.
        */

        int  sizeArr = 0;

        try 
        {
             sizeArr    = Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the array: "));
             if (sizeArr <= 0) 
             {
                 System.out.println("Not zero or negative");
                 System.exit(1);
             } 
        }
        catch(NumberFormatException s)
        {
            System.out.println("In String\"" + s.getLocalizedMessage() + "\" no a number");
            System.exit(1);
        }
        
        int arr[][] = new int[sizeArr][];
        for (int i = 0; i < sizeArr; ++i)
        {
            arr[i] = new int[i + 1];
        }
        
        
        for (int i = 0; i < arr.length; ++i)
        {
            for (int j = 0; j < arr[i].length; ++j)
            {
                try 
				{
                    sizeArr = Integer.parseInt(JOptionPane.showInputDialog("arr[" + i + "][" + j + "] = "));
                } 
				catch(NumberFormatException s)
                {
                    System.out.println("In String\"" + s.getLocalizedMessage() + "\" no a number");
					System.exit(1);
                }
                arr[i][j] = sizeArr;
            }
            System.out.println();
        }
        
        
        
        for (int i = 0; i < arr.length; ++i)
        {
            for (int j = 0; j < arr[i].length; ++j)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        
        FindMostNearTo_10(arr);
        
        System.out.println("Lab1.Ex2.end");
    }
    
	 private static void FindMostNearTo_10(int[][] arr) 
    {
        int el = 0, dist = Integer.MAX_VALUE, new_dist = dist;
        int row = 0, col = 0;
        for (int i = 0; i < arr.length; ++i)
        {
            for (int j = 0; j < arr[i].length; ++j)
            {
                new_dist = Math.abs(arr[i][j] - 10);
                if (new_dist < dist) 
                {
                    dist = new_dist;
                    row = i;
                    col = j;
                    el   = arr[i][j];
                }
            }
        }
        System.out.println("Most near to 10:  arr[" + row + "][" + col + "] = " + el + ";");
    }
	
    public static void ExC() {
        System.out.println("Lab1.Ex3");
        // Create a class Employee. 
        // Public methods: an your descretion
        // Private instance field: ID number, name, position, salary.
        // Write the overloaded constructor.
        // If passed only name, 
        // constructor create object {ID#, name, “worker”, 5000}.
        // If passed name and position, constructor analyzes 
        // position and create one of following: 
        // {ID#, name, “worker”, 5000} if position = “worker”, 
        // or {ID#, name, position, 6000} for another value of position. 
        // If passed three parameters, 
        // create object: {name, position, salary}.
        // ID# - start at 1, that 2, and etc.. 
        // ID# automatically assigned to each new employee. 
        // not passed as the parameter.
        // Write a program, that create array of 10 Employees, 
        // passing constructor different number of parameters 
        // Then, by calling static methods of Employee,
        // displays all Employees, 
        // calculate total salary of Employees 
        // and displays position with highest salary

        Employee Employees[] = new Employee[10];
        
        Employees[0] = new Employee("Alex");
        Employees[1] = new Employee("Boris");
        Employees[2] = new Employee("Sergey" , "CEO");        
        Employees[3] = new Employee("Antoniy" , "worker");               
        Employees[4] = new Employee("Evgenie" , "CFO" , 20000);               
        Employees[5] = new Employee("Igor" , "driver" , 6000);               
        Employees[6] = new Employee("Kirril" , "manager" , 8000);               
        Employees[7] = new Employee("Anna" , "secretary" , 2000);               
        Employees[8] = new Employee("Nikolay" , "developer" , 15000);               
        Employees[9] = new Employee("Alex" , "developer" , 15000);
        
        Employee.PrintEmployees(Employees);

        System.out.println("Lab1.Ex3.end");
    }
    
    public static void ExD() {
        System.out.println("Lab1::Ex4");
        //   Animal (abstract)
        //   Fish extend Animal; Bird extend Bird;
        //   Mammal (abstract) extend Animal;
        //   SeaMammal extend Mammal; TerreMammal extend Mammal;
        
        // All animals have a unique name.
        // All animals hame four methods: 
		// constructor, moves(), sound(), output().
        // moves() returns “swim” for fish and marine animals,
        // “fly” – for birds, 
		// “run” – for another.
        // Sound() return  “nothing” for fish, “Chirp!” for birds, 
        // foe mammals depending on the particular odject instanse
        // output() displays the name of the class and type of animal.
        
        // Write a program that creates a given class hierarchy 
        // and the following instancse:
        // - shark       -eagle
        // - whale      - dog?
        // and checks how the given functions.
        //
        // Store this animals in array and check polymorphism 
        // and dinamic binding

        Animal animal[] = new Animal[4];
        animal[0] = new Fish("Shark");
        animal[1] = new Bird("Eagle");
        animal[2] = new SeaMammal("Whale", "Songs");
        animal[3] = new TerreMammal("Dog", "Gav");

        for(Animal el : animal) 
		{
            el.output();
            System.out.println("Sound: " + el.Sound() + "; moves: " + el.moves() + ";");
        }
        System.out.println("Lab1.Ex4.end");
    }
}
