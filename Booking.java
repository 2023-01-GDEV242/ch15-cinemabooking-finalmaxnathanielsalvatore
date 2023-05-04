import java.util.ArrayList;

/**
 * This class represents a booking for the cinema. A booking contains
 * information on which show the customer is attending, which theater the
 * customer is sitting in along with their row and seat number(s), the price
 * of the booking, and the phone number that they can be contacted at.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.04
 */
public class Booking
{
    private Show show;
    private Theater theater;
    private Row row;
    private ArrayList<Seat> seats;
    private double price;
    private String phoneNumber;

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
}
