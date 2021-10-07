import java.util.Scanner;
/**
 * Converts retard units into normal units
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TemperatureConversionUI
{
    // attributes
    private CentigradeTemperature c;
    private FahrenheitTemperature f;
    private Scanner myScanner;
    // constructor
    public TemperatureConversionUI()
    {
     c = new CentigradeTemperature();
     f = new FahrenheitTemperature ();
     myScanner = new Scanner(System.in);
    }
    //methods
    private int getCommand()
    {
	 System.out.print ("Enter command: ");
     int command = myScanner.nextInt();
     myScanner.nextLine();  // handle eol
	 return command;
    }
    
    private void displayMenu()
    {
	 System.out.println( "Options are" );
	 System.out.println("Convert from Fahrenheit to Centigrade enter 1");
	 System.out.println("Convert from Centigrade to Fahrenheit enter 2");
	 System.out.println("To end program enter 3");
    }

    private void doFToC()
    {
        System.out.print("Enter F temperature: ");
        double ft = myScanner.nextDouble();
        f.setFTemperature(ft);
        System.out.println(ft + "F equals " + f.convertToCentigrade() + "C");
    }
    
    private void doCToF()
    {
        System.out.print("Enter C temperature: ");
        double ct = myScanner.nextDouble();
        c.setCTemperature(ct);
        System.out.println(ct + "C equals " +c.convertToFahrenheit()  + "F");

    }

    private void execute( int command)
    {
	 if ( command == 1)
		doFToC();
	 else
	 if ( command == 2 )
		doCToF();
	 else
	 if ( command == 3)
		System.exit(0);
	 else
		System.out.println("Unknown command");
    }

    public void menu()
    {
	 int command = -1;
     while (command !=0)
     {	
		displayMenu();
		command = getCommand();
		execute( command );
     }
    }

}
