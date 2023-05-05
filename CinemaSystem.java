import java.util.ArrayList;

/**
 * A system that will create a cinema, initialize the theaters, and create
 * show bookings for customers. However, this will not contain the logic of
 * how the objects  work, similar to the Simulator Project.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.05
 */
public class CinemaSystem
{
    // the list of shows from the collection
    private ShowCollection showList;
    // the list of bookings
    private ArrayList<Booking> bookings;
    // the list of theaters
    private ArrayList<Theater> theaterList;
    // today's date
    private String currentDate;

    /**
     * Constructor for objects of class CinemaSystem
     */
    public CinemaSystem()
    {
        showList = new ShowCollection();
        bookings = new ArrayList<Booking>();
        theaterList = new ArrayList<Theater>();
        currentDate = currentDate();
    }

    /**
     * Returns today's date.
     * @return today's date.
     */
    private String currentDate()
    {
        return null;
    }
    
    /**
     * Finds shows being screened on a particular day. Will most often be
     * used to find out what is being shown today.
     * @param day the day that the person wants to see a show.
     * @return the list of shows being shown on that day.
     */
    public ShowCollection findShows(String day)
    {
        return showList.findShowsByDay(day);
    }
    
    /**
     * Finds shows for a particular movie being screened on a particular day.
     * @param movie the movie that the person wants to see.
     * @param day the day that the person wants to see the movie.
     * @return the list of shows for that movie being shown on that day.
     */
    public ShowCollection findShows(Movie movie, String day)
    {
        ShowCollection shows = showList.findShowsByDay(day);
        return shows.findShowsByMovie(movie);
    }
    
    /**
     * Displays the details of a particular show.
     * @param show the show that details are being displayed for.
     * @return the show's details.
     */
    public String displayShowDetails(Show show)
    {
        return show.displayDetails();
    }
    
    /**
     * Initiates a seat reservation for a show.
     * @param show the show that the reservation is for.
     * @param theater the theater that the customer will be seated in.
     * @param row the row that the customer will be seated in.
     * @param seats the seats that the customer will be seated in.
     * @return true if the reservation was successful, and false otherwise.
     */
    public boolean acceptReservation(Show show, Theater theater, Row row,
                            ArrayList<Seat> seats)
    {
        boolean success = show.reserve(theater, row, seats);
        if (success)
            bookings.add(new Booking(show, theater, row, seats, null));
        return success;
    }
    
    /**
     * Returns the Booking object for a particular show and under a particular
     * phone number.
     * @param show the show that the booking is for.
     * @param phoneNumber the phone number that the booking is under.
     * @return the Booking object.
     */
    public Booking findBooking(Show show, String phoneNumber)
    {
        return null;
    }
    
    /**
     * Returns all Booking objects for a particular show. Will most often be
     * used when a show is canceled.
     * @param show the show that the bookings are for.
     * @return the list of Booking objects for the show.
     */
    public ArrayList<Booking> findBookings(Show show)
    {
        return null;
    }
    
    /**
     * Creates a new theater.
     * @param t the name of the theater.
     */
    public void createTheater(String t)
    {
        theaterList.add(new Theater(t));
    }
    
    /**
     * Returns the Theater object that has a particular theater name.
     * @param t the name of the theater.
     * @return the Theater object.
     */
    private Theater getTheater(String t)
    {
        for (Theater theater : theaterList)
            if (t.equals(theater.getTheaterName()))
                return theater;
        return null;
    }
    
    /**
     * Adds a show to showList.
     * @param movie the movie being shown.
     * @param date the date of the show.
     * @param time the time of the show.
     */
    public void addShow(Movie movie, String date, String time)
    {
        showList.add(new Show(movie, date, time));
    }
}