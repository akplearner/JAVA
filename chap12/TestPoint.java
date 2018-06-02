//package generics;

/** 
 * This program demonstrates the point class
 * */

 public class TestPoint {
    
    public static void main(String[] args){
        
        //Create two double objects to use as coordinates.
        
        Double dblX = new Double(1.5);
        Double dblY = new Double(2.5);
        
        //Create a Point object that can hold Doubles
        Point<Double> dPoint = new Point<>(dblX, dblY);
        
        //Create two Integer Objects to use as coordinates.
        
        Integer intX = new Integer(10);
        Integer intY = new Integer(20);
        
        //Create a Point object that can hold Integers.
        Point<Integer> iPoint = new Point<>(intX, intY);
        
        //Display the double values stored in the dPoint.
        System.out.println("Here are the values in the dPoint.");
        System.out.println("X coordinate: " + dPoint.getX());
        System.out.println("Y Coordinatee: " + dPoint.getY());
        System.out.println();
        
        //Display the Integer values stored in the iPoint.
        System.out.println("Here are the values in the iPoint.");
        System.out.println("X coordinate: " + iPoint.getX());
        System.out.println("Y Coordinatee: " + iPoint.getY());
        System.out.println();
    }
}
