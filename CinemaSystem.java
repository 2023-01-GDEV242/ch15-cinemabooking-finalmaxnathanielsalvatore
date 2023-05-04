/**
 * A system that will create a cinema, initialise the theaters, and
 * provide show bookings for customers.  However, this will not
 * contain the code logic, similar to the Simulator Project.
 *
 * @author Salvatore Anzalone
 * @version 5/4/2023
 */
public class CinemaSystem
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CinemaSystem
     */
    public CinemaSystem()
    {
        // initialise instance variables
        createCinema();
    }

    /**
     * Creates a simple cinema
     *
     */
    private int createCinema()
    {
        // put your code here
        return x;
    }
    
    /**
     * Gets the time that the show begins.
     */
    public void getTime()
    {
        System.out.println("This show begins at 5:30 PM");
    }
    
    /**
     * Gets the day that the show begins
     */
    public void getDay()
    {
        System.out.println("This show will air at your local " +
                            "cinema on May 10'th");
    }
}