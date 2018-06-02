//package generics;

public class Point3D<T extends Number> extends Point2<T> {
    
    private T zCoordinate; //The z coordinate.
    
    public Point3D(T x, T y, T z){
        
        //Call the Point2 class constructor.
        super(x, y);
        
        zCoordinate = z;
    }
    
    /**
     * The setZ method sets the zCoordinate.
     * @param z The value for the z coordinate.
     */
    public void setZ(T z){
        zCoordinate = z;
    }
    
    /**
     * The getZ method returns the z coordinate.
     * @return The value of z coordinate.
     */
    public T getZ(){
        return zCoordinate;
    }
    
    public static void main(String[] args){
        
        Point3D<Integer> point = new Point3D<>(10, 20, 30);
        
        //Display the coordinates
        System.out.println("Here are the values in the point");
        System.out.println("X coordinate: " + point.getX());
        System.out.println("Y coordinate: " + point.getY());
        System.out.println("Z coordinate: " + point.getZ());
    }

}
