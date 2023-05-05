import java.util.ArrayList;

/**
 * This class represents the currently booked seating for a given show in a
 * given theater.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.05
 */
public class ShowSeating
{
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
        initialize();
    }
    
    /**
     * Initializes the seating list with false values for each seat in the
     * theater.
     */
    private void initialize()
    {
        for (int i = 0; i < theater.getNumRows(); i ++)
        {
            ArrayList<Boolean> booleanList = new ArrayList<Boolean>();
            for (int j = 0; j < theater.getRow(i).getNumSeats(); j ++)
                booleanList.add(true);
            availableSeats.add(booleanList);
        }
    }
    
    /**
     * Accessor method for theater.
     * @return theater.
     */
    public Theater getTheater()
    {
        return theater;
    }
    
    /**
     * Returns the number of free seats for this show in this theater.
     * @return the number of free seats.
     */
    public int numFreeSeats()
    {
        return 0;
    }
    
    /**
     * Reserves a seat by setting its value in availableSeats to false. If the
     * seat was already reserved, the reservation fails.
     * @param rowIndex the index of the row where seats are being reserved.
     * @param seatIndexes the index of the seats that are being reserved.
     */
    public boolean acceptReservation(int rowIndex,
                                        ArrayList<Integer> seatIndexes)
    {
        ArrayList<Boolean> seats = new ArrayList<Boolean>();
        for (int seatIndex : seatIndexes)
            seats.add(availableSeats.get(rowIndex).get(seatIndex));
        
        boolean available = true;
        for (boolean seat : seats)
            if (seat == false)
                available = false;
        if (available)
        {
            for (int seatIndex : seatIndexes)
                availableSeats.get(rowIndex).set(seatIndex, false);
            return true;
        }
        return false;
    }
    
    /**
     * Returns a list of the indexes of rows with available seats.
     * @return a list of the indexes of rows with available seats.
     */
    public ArrayList<Integer> getFreeRows()
    {
        return null;
    }
    
    /**
     * Returns a list of the indexes of available seats within a row.
     * @param rowIndex the index of the row being checked.
     * @return a list of the indexes of available seats.
     */
    public ArrayList<Integer> getFreeSeats(int rowIndex)
    {
        return null;
    }
    
    /**
     * Checks the seating for x adjoining seats.
     * @param x the number of adjoining seats.
     * @return the list of row numbers that contain x adjoining seats. If no
     * row contains x adjoining seats, then null is returned.
     */
    public ArrayList<Integer> xFreeSeats(int x)
    {
        return null;
    }
}