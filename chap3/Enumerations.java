
public class Enumerations{
    enum MovieRating {E,A,B}
    public static void main(String[] args){
        
        MovieRating rating;
        rating = MovieRating.A;
        switch (rating){
            case E: 
                System.out.println("You must see movie.");
                break;
            case A:
                System.out.println("This movie is OK, but not great.");
                break;
            case B:
                System.out.println("Skip it!.");
                break;
            default:
                System.out.println("Something is wrong.");
        }   
    }
}