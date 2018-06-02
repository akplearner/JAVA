public class ex2_Android{
//instance variables
    private static int tag=1;
    private String name;
//constructor
    public ex2_Android(){
        this.changeTag();
        name="Bob" + tag;
    }
//setters and getters
    public String getName(){
        return name;
    }
//methods
    private static boolean isPrime(int n){
        for(int i=2; i<n ; i++ ){
            if( n%i==0 ) return false;
        }
        return true;
    }
    public int changeTag(){
        print(tag);
        tag++;
        print(tag);
        if( !isPrime(tag) ){
            tag++;
            print(tag);

        }
        return tag;
    }
    public String toString(){
        return "Name:"+name +" -- "+
                "tag:"+ tag;
    }
    public void print(int t){
        System.out.println("tag is:"+t+"|");
    }
//running program
    public static void main(String[] args){
        ex2_Android app = new ex2_Android();
        System.out.println( app.toString() );
    }
}