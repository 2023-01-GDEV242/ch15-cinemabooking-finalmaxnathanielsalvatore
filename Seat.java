/**
 * This class represents an individual seat within a row of a theater.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.05
 */
public class Seat
{
    // the seat number
    private int seatNum;

    /**
     * Constructor for objects of class Seat
     * @param s the seat number to be assigned
     */
    public Seat(int s)
    {
        seatNum = s;
    }
    
    /**
     * Accessor method for seatNum.
     * @return seatNum.
     */
    public int getSeatNum()
    {
        return seatNum;
    }
}