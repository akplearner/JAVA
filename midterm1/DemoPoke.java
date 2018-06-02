public class DemoPoke{
//main
    public static void main(String[] args){
        Card[] player1 = new Card[5];
        int n;
        for( int i=0; i<5 ; i++ ){
            n = (int)(Math.random()*15);
            System.out.println("Card["+i+"]: "+n);
        }

    }
}