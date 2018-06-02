public class SSNCharacterException extends Exception{
//constructor 
    public SSNCharacterException(){
        super("SSN is not integers without dashes or space.");
    }
}