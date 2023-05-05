import java.util.ArrayList;

/**
 * This class contains the collection, implemented as an ArrayList, of shows
 * that the cinema is screening.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.05
 */
public class ShowCollection
{
    // the list of shows
    private ArrayList<Show> showList;

    /**
     * Constructor for ShowCollection
     */
    public ShowCollection()
    {
        showList = new ArrayList<Show>();
    }
    
    /**
     * Adds a show to the collection.
     * @param show the show to be added.
     */
    public void add(Show show)
    {
        showList.add(show);
    }
    
    /**
     * Searches showList for shows being screened on a particular day.
     * @param day the day being searched.
     * @return the list of shows being screened on that day.
     */
    public ShowCollection findShowsByDay(String day)
    {
        ShowCollection shows = new ShowCollection();
        for (Show show : showList)
            if (day.equals(show.getDate()))
                shows.add(show);
        return shows;
    }
    
    /**
     * Searches showList for shows of a particular movie.
     * @param movie the movie being searched.
     * @return the list of shows of that movie.
     */
    public ShowCollection findShowsByMovie(Movie movie)
    {
        ShowCollection shows = new ShowCollection();
        for (Show show : showList)
            if (movie == show.getMovie())
                shows.add(show);
        return shows;
    }
}