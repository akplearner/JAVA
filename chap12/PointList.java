//package generics;

import java.util.ArrayList;

public class PointList<E extends Point<?>> {
    private ArrayList<E> list;;
    
    public PointList(){
        list = new ArrayList<>();
    }
    
    public void add(E obj){
        list.add(obj);
    }
    public String toString(){
        String str = "";
        for (E element: list)
        str += "[" + element.getX() + ", "
                + element.getY() + "] \n";
        return str;
    }
}
