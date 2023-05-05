import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ShowTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ShowTest
{
    /**
     * Default constructor for test class ShowTest
     */
    public ShowTest()
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
    public void ReservationTest()
    {
        Movie movie1 = new Movie(null, null);
        Show show1 = new Show(movie1, null, null);
        Theater theater1 = new Theater("Theater A");
        theater1.addRow();
        Row row1 = theater1.getRow(0);
        row1.addSeat();
        Seat seat1 = row1.getSeat(0);
        show1.addTheater(theater1);
        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(seat1);
        assertTrue(show1.reserve(theater1, row1, seats));
        assertFalse(show1.reserve(theater1, row1, seats));
    }
}

