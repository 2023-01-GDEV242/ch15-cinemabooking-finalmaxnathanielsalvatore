import java.util.ArrayList;

/**
 * This class represents a row in a theater.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.05
 */
public class Row
{
    // the row number
    private int rowNum;
    // the list of seats
    private ArrayList<Seat> seatList;
    // the max number of seats per row
    private final int MAX_SEATS = 30;
    // the number of seats in the row
    private int numSeats;

    /**
     * Constructor for objects of class Row
     */
    public Row(int r)
    {
        rowNum = r;
        seatList = new ArrayList<Seat>();
        numSeats = 0;
    }
    
    /**
     * Accessor method for rowNum.
     * @return rowNum.
     */
    public int getRowNum()
    {
        return rowNum;
    }
    
    /**
     * Accessor method for numSeats.
     * @return numSeats.
     */
    public int getNumSeats()
    {
        return numSeats;
    }
    
    /**
     * Returns a particular seat in the row.
     * @param seatIndex the index of the seat.
     * @return the seat.
     */
    public Seat getSeat(int seatIndex)
    {
        return seatList.get(seatIndex);
    }
    
    /**
     * Adds a seat to the row.
     */
    public void addSeat()
    {
        seatList.add(new Seat(numSeats + 1));
        numSeats ++;
    }
}