
/**
 * Write a description of class CentigradeTemperature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CentigradeTemperature
{
    private double cTemperature; // The Fahrenheit temperature

    public CentigradeTemperature()
    {   
        cTemperature = 0.0; // freezing point of water
    }
    
    public double getCTemperature()
    {
        return cTemperature;
    }
	
    public double convertToFahrenheit()
    {
        double fahrenheit;
	    
        fahrenheit = 9.0 * cTemperature / 5.0 + 32.0;

        return fahrenheit;
    }
		
    public void setCTemperature( double newCTemperature)
    {
        cTemperature =newCTemperature;
    }
 
}
