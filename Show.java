import java.util.ArrayList;

/**
 * This class represents a show that the cinema is screening. A show is the
 * screening of a given movie at a certain time.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.05
 */
public class Show
{
    // the movie that is being screened
    private Movie movie;
    // the day of the show
    private String date;
    // the time of the show
    private String time;
    // the list of theaters that the show is being screened in
    private ArrayList<Theater> theaterList;
    // the list of seating information for the various theaters that the show
    // is being screened in
    private ArrayList<ShowSeating> showSeatingList;
    
    /**
     * Constructor for objects of class Show
     */
    public Show(Movie movie, String date, String time)
    {
        this.movie = movie;
        this.date = date;
        this.time = time;
        theaterList = new ArrayList<Theater>();
        showSeatingList = new ArrayList<ShowSeating>();
    }
    
    /**
     * Accessor method for movie.
     * @return movie.
     */
    public Movie getMovie()
    {
        return movie;
    }
    
    /**
     * Accessor method for date.
     * @return date.
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * Accessor method for theaterList.
     * @return theaterList.
     */
    public ArrayList<Theater> getTheaterList()
    {
        return theaterList;
    }
    
    /**
     * Returns the price of the movie being screened for this show.
     * @return the price of the movie.
     */
    public double getMoviePrice()
    {
        return movie.getPrice();
    }
    
    /**
     * Displays the details for this show, including the title of the movie
     * and the day and time it is being screened.
     * @return the show's details.
     */
    public String displayDetails()
    {
        return null;
    }
    
    /**
     * Adds a theater to the list of theaters that the show is being screened
     * in.
     * @param theater the theater to be added.
     */
    public void addTheater(Theater theater)
    {
        theaterList.add(theater);
        showSeatingList.add(new ShowSeating(this, theater));
    }
    
    /**
     * Returns the ShowSeating object for a particular theater for this show.
     * @param theater the theater that the ShowSeating object is for.
     * @return the ShowSeating object.
     */
    private ShowSeating getShowSeating(Theater theater)
    {
        for (ShowSeating seating : showSeatingList)
            if (theater == seating.getTheater())
                return seating;
        return null;
    }
    
    /**
     * Returns the number of free seats for this show in a particular theater.
     * @param theater the theater to count the free seats of.
     * @return the number of free seats.
     */
    public int numFreeSeatsInTheater(Theater theater)
    {
        return getShowSeating(theater).numFreeSeats();
    }
    
    /**
     * Reserves seats.
     * @param theater the theater that the customer will be seated in.
     * @param row the row that the customer will be seated in.
     * @param seats the seat(s) that the customer will be seated in.
     */
    public boolean reserve(Theater theater, Row row, ArrayList<Seat> seats)
    {
        int rowIndex = row.getRowNum() - 1;
        ArrayList<Integer> seatIndexes = new ArrayList<Integer>();
        for (Seat seat : seats)
            seatIndexes.add(seat.getSeatNum() - 1);
        return getShowSeating(theater).acceptReservation(rowIndex, seatIndexes);
    }
    
    /**
     * Returns a list of row numbers in a particular theater that have
     * available seats.
     * @param theater the theater being checked.
     * @return a list of row numbers that have available seats.
     */
    public ArrayList<Integer> getFreeRows(Theater theater)
    {
        ArrayList<Integer> rowIndexes = new ArrayList<Integer>();
        rowIndexes = getShowSeating(theater).getFreeRows();
        for (int i = 0; i < rowIndexes.size(); i ++)
            rowIndexes.set(i, rowIndexes.get(i) + 1);
        return rowIndexes;
    }
    
    /**
     * Returns a list of seat numbers in a particular row that are available.
     * @param theater the theater being checked.
     * @param rowNum the number of the row being checked.
     * @return a list of seat numbers that are available.
     */
    public ArrayList<Integer> getFreeSeats(Theater theater, int rowNum)
    {
        ArrayList<Integer> seatIndexes = new ArrayList<Integer>();
        seatIndexes = getShowSeating(theater).getFreeSeats(rowNum - 1);
        for (int i = 0; i < seatIndexes.size(); i ++)
            seatIndexes.set(i, seatIndexes.get(i) + 1);
        return seatIndexes;
    }
    
    /**
     * Checks the seating for this show in a particular theater for x
     * adjoining seats.
     * @param theater the theater being checked.
     * @param x the number of adjoining seats.
     * @return the list of row numbers that contain x adjoining seats.
     */
    public ArrayList<Integer> xFreeSeats(Theater theater, int x)
    {
        return getShowSeating(theater).xFreeSeats(x);
    }
}