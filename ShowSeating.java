import java.util.ArrayList;

/**
 * This class represents the currently booked seating for a given show in a
 * given theater.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.04
 */
public class ShowSeating
{
    /*
    //Seats that are either free or not free
    private boolean freeSeat;
    //Seats that are reserved
    private boolean reserveSeat;
    //Indicate if a show has been cancelled or not
    private boolean open;

    /**
     * Constructor for objects of class ShowSeating
     *
    public ShowSeating()
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
     *
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
    */
    
    // the show
    private Show show;
    // the theater
    private Theater theater;
    // This is a representation of the currently available seats. It is
    // effectively a 2D ArrayList that mimics the seating of the theater.
    // Values of true represent available seats, and values of false
    // represent reserved seats.
    private ArrayList<ArrayList<Boolean>> availableSeats;
    
    /**
     * Constructor for objects of class ShowSeating
     */
    public ShowSeating(Show show, Theater theater)
    {
        this.show = show;
        this.theater = theater;
        availableSeats = new ArrayList<ArrayList<Boolean>>();
    }
}
