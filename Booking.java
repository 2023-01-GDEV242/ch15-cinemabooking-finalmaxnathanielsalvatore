import java.util.ArrayList;

/**
 * This class represents a booking for the cinema. A booking contains
 * information on which show the customer is attending, which theater the
 * customer is sitting in along with their row and seat number(s), the price
 * of the booking, and the phone number that they can be contacted at.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.05
 */
public class Booking
{
    private Show show;
    private Theater theater;
    private Row row;
    private ArrayList<Seat> seats;
    private double price;
    private String phoneNumber;
    boolean cancelled;

    /**
     * Constructor for objects of class Booking
     */
    public Booking(Show show, Theater theater, Row row, ArrayList<Seat> seats,
                    String phoneNumber)
    {
        this.show = show;
        this.theater = theater;
        this.row = row;
        this.seats = seats;
        price = calculatePrice();
        this.phoneNumber = phoneNumber;
        cancelled = false;
    }

    /**
     * Accessor method for show.
     * @return show.
     */
    public Show getShow()
    {
        return show;
    }
    
    /**
     * Accessor method for phoneNumber.
     * @return phoneNumber.
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    /**
     * Calculates the total price of the booking by multiplying the price of
     * the movie by the number of seats booked.
     * @return the total price of the booking.
     */
    private double calculatePrice()
    {
        return show.getMoviePrice() * seats.size();
    }
    
    /**
     * Returns the row number of the booking.
     * @return the row number of the booking.
     */
    public int getRowNum()
    {
        return row.getRowNum();
    }
    
    /**
     * Returns the seat number(s) of the booking.
     * @return the seat number(s) of the booking.
     */
    public ArrayList<Integer> getSeatNums()
    {
        ArrayList<Integer> seatNums = new ArrayList<Integer>();
        for (Seat seat : seats)
            seatNums.add(seat.getSeatNum());
        return seatNums;
    }
    
    /**
     * Cancels the booking and sets the seats to free.
     */
    public void cancel()
    {
        // cancels the booking and sets the seats to free
    }
}