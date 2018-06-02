public class Complex{
    //instance variables.
    private double real,imaginary;    
    //methods.
    public Complex(double x, double y){
        real = x;
        imaginary = y;
    }
    public boolean equals(Complex other){
        return real == other.real && imaginary== other.imaginary;
    }
    public Complex add(Complex c) {
            return new Complex(real + c.real ,imaginary + c.imaginary);
    }
    public static Complex add(Complex a , Complex b){
        return a.addOn(b);
    }
    public Complex subtractOff(Complex c){
        return new Complex(real - c.real , imaginary-c.imaginary);
    }
    public Complex multiplyBy(Complex c){
        return new Complex (real*c.real, imaginary*c.imaginary, real*c.imaginary,imaginary*c.real);
    }
    public Complex dividedBy(Complex c) throws Exception{
        try{
            if(c.modulus()==0){ 
                throw new Exception("Illegal divide by 0");
            }
            return {multiplicationBy(c.conjugate()).scaleBy(1/(c.modulus()*c.modulus()));}
            catch(Exception e){ 
                countOfErrors++;
                throw e;
            }
        }
    }
    private Complex scaleBy(double d) {
		return new Complex(real * d, imaginary * d);
	}

	private double modulus() {
		return Math.sqrt(real * real + imaginary * imaginary);
	}

	private Complex conjugate() {
		return new Complex(real, -imaginary);
	}

	public static Complex subtract(Complex a, Complex b) {
		return a.subtractOff(b);
	}

	public static Complex multiply(Complex a, Complex b) {
		return a.multiplyBy(b);
	}

	public static Complex divide(Complex a, Complex b) throws Exception {
		return a.divideBy(b);
	}

	public static int countOfErrors = 0; // static field, one copy for the whole
					

    //set's & get's
    public void setReal(double x){
        real = x;
    }
    public void setImaginary(double x){
        imaginary = x;
    }

    //print
    public String toString(){
        return real + " + " + imaginary + "i" ;
    }

    //main class
    public static void main(String args[]) throws Exception {
        
                Complex a; // declare a variable with an Object type
                            // Complex is a service class
                a = new Complex(1, 2); // create an Object in computer memory and move
                                        // the variable a to tag it
        
                Complex b = new Complex(0, 1);
        
                Complex c = a.addOn(b); // declare c and move it to tag the Object
                                        // created by the addOn method
        
                System.out.println("c is " + c); // implicitly calls the toString()
                                                    // method of Object c ----
                                                    // this methods is nice for
                                                    // debugging so should generally be
                                                    // implemented for all classes
        
                System.out.println("sum is " + Complex.add(a, b)); // another way to add
                                                                    // Complex numbers,
                                                                    // called through
                                                                    // the class
                // that means its a static method
        
                System.out.println("product " + Complex.multiply(a, b));
                System.out.println("quotient " + Complex.divide(a, b));
        
                System.out.println("Current error count " + Complex.countOfErrors);
                // countOfErrors must be a static field. Why?
        
                try {
                    System.out.println(c.divideBy(new Complex(0, 0)));
                } catch (Exception e) {
                    System.out.println(e);
                }
        
                System.out.println("Total number of errors detected "
                        + Complex.countOfErrors);
        
                Complex x = a.addOn(b);
                Complex y = Complex.add(a, b);
        
                // Example of use of == and .equals()
        
                System.out.print("x is " + x + " and y is " + y + " but x == y gives ");
                System.out.print(x == y);
                System.out.print(" and x.equals(y) gives ");
                System.out.println(x.equals(y));
        
                // Aliases: Can you predict output here?
                System.out.println("Initially a is " + a);
                Complex duplicate = a; // declare another variable and move it to tag
                                        // the same Object as a --- an alias
        
                duplicate.setReal(10);
                System.out.println("Change duplicate and a is " + a);
                a = new Complex(0, 0);
                System.out.println("Set a as new object and a is " + a);
                System.out.println("But duplicate is " + duplicate);
                duplicate.setReal(20);
                System.out.println("Change duplicate and a is " + a);
                System.out.println("But duplicate is " + duplicate);
            }
        
}