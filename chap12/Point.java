//package generics;

/** 
 * The Point class holds X and Y coordinates.
 * The data type of the coordinates is generic
*/

public class Point <T extends Comparable<T>> implements Comparable<Point<T>>{
    
    private T xCoordinate;
    private T yCoordinate;
    
    /** 
     * Constructor
     * @param x The X coordinate.
     * @param y The Y coordinate.
     */
    
    public Point(T x, T y){
        xCoordinate = x;
        yCoordinate = y;
    }
    
    /**
     * The setX method sets the X coordinate.
     * @param x The value for the X coordinate.
     *  */
    public void setX(T x){
        xCoordinate = x;
    }
    
    /**
     * The setY method sets the Y coordinate.
     * @param y The value for the y coordinate.
     *  */
    public void setY(T y){
        yCoordinate = y;
    }
  
    /**
     * The getX method gets the X coordinate.
     * @return The value of the X coordinate.
     *  */
    public T getX(){
        return xCoordinate;
    }
    
    /**
     * The getY method gets the Y coordinate.
     * @return The value of the Y coordinate.
     *  */
    public T getY(){
        return yCoordinate;
    }

    @Override
    public int compareTo(Point<T> other) {
        int ans = xCoordinate.compareTo(other.xCoordinate);
        if (ans != 0) return ans;
        return yCoordinate.compareTo(other.yCoordinate);
    }
}
