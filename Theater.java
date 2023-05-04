import java.util.ArrayList;

/**
 * This class represents a theater in the cinema. A theater contains rows
 * which in turn contain seats.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.04
 */
public class Theater
{
    // the theater name
    private String theaterName;
    // the list of rows
    private ArrayList<Row> rowList;
    // the max number of rows per theater
    private final int MAX_ROWS = 40;

    /**
     * Constructor for objects of class Theater
     */
    public Theater(String t)
    {
        theaterName = t;
        rowList = new ArrayList<Row>();
    }
}