// Class 1.  More about output, String concatenation

public class Hello2 {     
    // convention: class names should be upper case
	public static void main(String args[]) {
        System.out.print("Hello. ");      
        // output without a new line
		System.out.println("Hello. " + " And hello again.");
		  // multiple outputs --- the + concatenates Strings so there is really one argument
		System.out.println("Hello " + 3 + " times.");
		  // other types can be concatenated onto a String with + too
		String s = "String ";   // type is String in Java
		s = s + s + s;         // + concatenates
		s = s + 3 + " times";  //   it adds Strings or numbers to a String
		System.out.println("\n\n" + s);
	}
}