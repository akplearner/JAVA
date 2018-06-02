public class RoomOccupancy{
//static instances
    private static int totalNumber = 0;
    private int numberInRoom;
//constructor
    public RoomOccupancy(){
        numberInRoom=0;
    }
//mutators and accessors
    public static int getTotal(){
        return totalNumber;
    }

    public void addOneToRoom(){
        numberInRoom++;
        totalNumber--;
    }

    public void removeOneFromRooom(){
        numberInRoom--;
        totalNumber--;
    }
    
    public int getNumber(){
        return numberInRoom;
    }

//Main class
    public static void main(String[] args){
        RoomOccupancy roomA = new RoomOccupancy();
        RoomOccupancy roomB = new RoomOccupancy();

        roomA.addOneToRoom();
        roomA.addOneToRoom();
        roomB.addOneToRoom();
        roomB.addOneToRoom();

        System.out.println("Number of persons in Room A: "+roomA.getNumber());//2 
        System.out.println("Number of persons in Room B: "+roomB.getNumber());

        roomA.removeOneFromRooom();
        roomB.removeOneFromRooom();
        
        System.out.println("Number of persons in Room A: "+roomA.getNumber());//1
        System.out.println("Number of persons in Room B: "+roomB.getNumber());
        
        roomA.removeOneFromRooom();
        System.out.println("Number of persons in Room A:"+roomA.getNumber());//0
        System.out.println("Number of persons in Room A:"+roomA.getNumber());

        RoomOccupancy roomC = new RoomOccupancy();
        roomC.addOneToRoom();
        roomC.addOneToRoom();
        roomC.addOneToRoom();
        roomC.addOneToRoom();

        System.out.println("Number of persons in Room A:"+roomA.getNumber());
        System.out.println("Number of persons in Room B:"+roomB.getNumber());
        System.out.println("Number of persons in Room C:"+roomC.getNumber());
    }
}