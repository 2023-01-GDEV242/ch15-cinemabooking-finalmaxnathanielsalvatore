/**
 * This class represents a movie that is being screened at the cinema.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.05
 */
public class Movie
{
    // the title of the movie
    private String title;
    // the description of the movie
    private String description;
    // the first day the movie is screened in this cinema
    private String startDate;
    // the last day the movie is screened in this cinema
    private String endDate;
    // the content rating of the movie (G, PG, etc.)
    private String contentRating;
    // the price of tickets to watch the movie
    private double price;

    /**
     * Constructor for objects of class Movie
     */
    public Movie(String title, String description)
    {
        this.title = title;
        this.description = description;
        price = 0;
    }
    
    /**
     * Accessor method for title.
     * @return title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Accessor method for price.
     * @return price.
     */
    public double getPrice()
    {
        return price;
    }
}