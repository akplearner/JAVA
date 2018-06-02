//
public point<T extendsns Number> {
    private T xCoordinate;
    private T yCoordinate;
}
//
public class PointList<Point extends<?>>
    ArrayList<point extends<?>> pList;
    public PointList(){
        pList = new ArrayList<>();
    }
//
public void add(Point<?>p){
    pList.add(p);
}