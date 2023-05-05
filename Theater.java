import java.util.ArrayList;

/**
 * This class represents a theater in the cinema. A theater contains rows
 * which in turn contain seats.
 *
 * @author Max, Nathaniel, and Salvatore
 * @version 2023.05.05
 */
public class Theater
{
    // the theater name
    private String theaterName;
    // the list of rows
    private ArrayList<Row> rowList;
    // the max number of rows per theater
    private final int MAX_ROWS = 30;
    // the number of rows in the theater
    private int numRows;

    /**
     * Constructor for objects of class Theater
     */
    public Theater(String t)
    {
        theaterName = t;
        rowList = new ArrayList<Row>();
        numRows = 0;
    }
    
    /**
     * Accessor method for theaterName.
     * @return theaterName.
     */
    public String getTheaterName()
    {
        return theaterName;
    }
    
    /**
     * Accessor method for numRows.
     * @return numRows.
     */
    public int getNumRows()
    {
        return numRows;
    }
    
    /**
     * Returns a particular row in the theater.
     * @param rowIndex the index of the row.
     * @return the row.
     */
    public Row getRow(int rowIndex)
    {
        return rowList.get(rowIndex);
    }
    
    /**
     * Adds a row to the theater.
     */
    public void addRow()
    {
        rowList.add(new Row(numRows + 1));
        numRows ++;
    }
}