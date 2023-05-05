import java.util.ArrayList;

/**
 * A system that will create a cinema, initialise the theaters, and
 * provide show bookings for customers.  However, this will not
 * contain the code logic, similar to the Simulator Project.
 *
 * @author Salvatore Anzalone
 * @version 5/5/2023
 */
public class CinemaSystem
{
    // A list of shows from the collection
    private ShowCollection showList;

    /**
     * Constructor for objects of class CinemaSystem
     */
    public CinemaSystem(ShowCollection showList)
    {
        this.showList = showList;
        createCinema();
    }

    /**
     * Creates a simple cinema, while presenting the details.
     */
    private ShowCollection createCinema()
    {
        return showList;
    }
    
    /**
     * Gets the time that the show begins.
     */
    public void getTime()
    {
        System.out.println("This show begins at 4:40 PM");
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