import java.util.Scanner;
/**
 * Template for menu based Text user interfaces .
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RectangleTUI
{
    // DECLARE SPECIFIC OBJECT HERE
    private Scanner keyboard;
    Rectangle rectangle= new Rectangle(0,0);
    /**
     * Constructor for objects of class TextTU
     */
    public RectangleTUI() 
    {
        // INSTANTIATE SPECIFIC OBJECTS HERE
        keyboard = new Scanner( System.in);
        rectangle=null;
    }

    public void menu()
    { 
        createRectangle();
        int command = -1;
        while ( command != 0 )
        { 
            displayMenu();
            command = getCommand();
            execute( command );
        }
    }

    private void displayMenu()
    {
     System.out.println();
     System.out.println("Enter number denoting action to perform:");
     System.out.println("Display length....................[1]");
     System.out.println("Display breadth..................[2]");
     System.out.println("Display area.......................[3]");
     System.out.println("Display perimeter...............[4]");
     System.out.println("Create new rectangle.........[5]");
     System.out.println("Exit.....................................[0]");    
    }


    private int getCommand()
    {
        System.out.print ("Enter command: ");
        int command = keyboard.nextInt();
        return command;
    }

    private void execute( int command)
    {
        // if ... else CHAIN HERE
        if ( command == 1)
            displayLength();
            else if ( command == 2 )
            displayBreadth();
            else if ( command == 3)
            displayArea();
            else if ( command == 4 )
            displayPerimeter();
            else if ( command == 5)
            createRectangle() ;
            else if ( command == 0)
        {            
            System.out.println( " Program closing down"); 
            System.exit(0);
        }
        else
            System.out.println("Unknown command"); 
            
        if ( command == 0)
        {
            System.out.println( " Program closing down");
        }
        else
        {
            System.out.println("Unknown command"); 
        }
    }    
    // PRIVATE METHODS HERE
    private void createRectangle()
    {
        int length;
        int breadth;
        length = readIntWithPrompt("Rectangle length (a non-negative integer): ");
        breadth = readIntWithPrompt("Rectangle breadth (a non-negative integer): ");
        rectangle = new Rectangle(length, breadth);
    }
    
    private int readIntWithPrompt(String prompt)
    {
     System.out.print(prompt);
     int input = keyboard.nextInt();
     keyboard.nextLine();
     return input;
    }
    
    private void displayLength()   
    {
        System.out.println( "The length is " + rectangle.getLength() );
    }
    
    private void displayBreadth() 
    {
        System.out.println( "The breadth is " + rectangle.getBreadth() );
    }

    private void displayArea()  
    {
        System.out.println( "The area is " + rectangle.calculateArea() );
    }

    private void displayPerimeter() 
    {
        System.out.println( "The perimeter is " + rectangle.calculatePerimeter() );
    }

}
