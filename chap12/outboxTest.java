import java.util.ArrayList;
public class outboxTest{
    public static void main(String[] args){
        ArrayList <String> aList = new ArrayList<>();
        for(int i=0 ; i<5 ; i++){
            aList.add("hello"+i+" "+aList.size());
            System.out.println(aList.get(i));           
        }
        
    }
}