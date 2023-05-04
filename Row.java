import java.util.ArrayList;

/**
 * This class represents a row in a theater.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.04
 */
public class Row
{
    // the row number
    private int rowNumber;
    // the list of seats
    private ArrayList<Seat> seatList;
    // the max number of seats per row
    private final int MAX_SEATS = 30;

    /**
     * Constructor for objects of class Row
     */
    public Row(int r)
    {
        rowNumber = r;
        seatList = new ArrayList<Seat>();
    }
}