import java.util.ArrayList;

/**
 * This class represents a show that the cinema is screening. A show is the
 * screening of a given movie at a certain time.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.04
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
    
    /**
     * Constructor for objects of class Show
     */
    public Show(Movie movie, String date, String time)
    {
        this.movie = movie;
        this.date = date;
        this.time = time;
        theaterList = new ArrayList<Theater>();
    }
    
    /**
     * Returns the price of the movie being screened for this show.
     * @return the price of the movie.
     */
    public double getMoviePrice()
    {
        return movie.getPrice();
    }
}