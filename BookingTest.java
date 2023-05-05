import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BookingTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BookingTest
{
    /**
     * Default constructor for test class BookingTest
     */
    public BookingTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void BookingCreationTest()
    {
        Movie movie1 = new Movie(null, null);
        Show show1 = new Show(movie1, null, null);
        Theater theater1 = new Theater("Theater A");
        Row row1 = new Row(1);
        Seat seat1 = new Seat(1);
        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(seat1);
        Booking booking1 = new Booking(show1, theater1, row1, seats,
                                        "1111111111");
        assertEquals(booking1.getShow(), show1);
        assertEquals(booking1.getPhoneNumber(), "1111111111");
    }
}


