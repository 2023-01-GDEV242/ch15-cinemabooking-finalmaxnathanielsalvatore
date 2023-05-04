import java.util.ArrayList;

/**
 * This class will hold details about the theater(s) being referenced
 * within the project, as well as the available, or free seats.
 * Likewise, seat reservations called by the ShowSeating class will be
 * taken into consideration, as they must be considered as seats that
 * have been taken.  Finally, this class will also indicate if a
 * show has been cancelled or not.
 *
 * @author Salvatore Anzalone
 * @version 5/4/2023
 */
public class Show
{
    //Seats that are either free or not free
    private boolean freeSeat;
    //Seats that are reserved
    private boolean reserveSeat;
    //Indicate if a show has been cancelled or not
    private boolean open;

    /**
     * Constructor for objects of class Show
     */
    public Show()
    {
        freeSeat = false;
        reserveSeat = false;
        open = false;
    }

    /**
     * Indicates whether a seat is free, or if it has been
     * taken in-person, or taken through a reservation.
     *
     * @param freeSeat  Seats that are either free or not free
     * @param reserveSeat  Seats that are reserved
     * @param open  Indicate if a show has been cancelled or not
     * @return A seat that is free or not, and indicate if a show
     * has been cancelled or not
     */
    public boolean available()
    {
        if(freeSeat == true)
        {
            System.out.println("Not taken");
            
            return freeSeat;
        }
        
        else if(freeSeat == false)
        {
            System.out.println("Taken in-person");
            
            return freeSeat;
        }
        
        else if(reserveSeat == true)
        {
            System.out.println("Taken as reservation");
            
            return freeSeat;
        }
        
        if(open == true)
        {
            return open;
        }
        
        else
        {
            return open;
        }
    }
}