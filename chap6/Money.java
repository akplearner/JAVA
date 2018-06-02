//Has a bug!!

import java.util.Scanner;
/**
 * Class representing nonnegatice amounts of money, such as $100, $41.99, $0.05.
 */
public class Money{
//instance varibles
    private long dollars;
    private long cents;
//set and get methods
    public void set(long newDollars){
        if(newDollars<0){
            System.out.println("Error: negative amount of money are not allowed.");
            System.exit(0);
        }else{
            dollars = newDollars;
            cents = 0;
        }
    }
    public void set(double newAmount){
        if(newAmount<0){
            System.out.println("Error: Negaive amounts of money not allowed.");
            System.exit(0);
        }else{
            long allCents = Math.round(newAmount*100);
            dollars = allCents/100;
            cents = allCents%100;
        }
    }
    public void set(Money moneyObject){
        this.dollars = moneyObject.dollars;
        this.cents = moneyObject.cents;
    }
    /**
     *Precondition: The argument is an ordinary representation of an amount of money,
     with or withut a dollar sign.
     Fraction of a cent are not allowed.
    */
    public void set(String amountString){
        String dollarsString;
        String centsString;

        //Delete '$' if any:
        if(amountString.charAt(0) == '$'){
            amountString = amountString.substring(1); //moves string to right by one.
        }
        amountString = amountString.trim();//remove any whitespaces
        //locate decimal.
        int pointLocation = amountString.indexOf(".");//find index number where found.
        if(pointLocation<0){ //if no decimal point
            cents = 0;
            dollars = Long.parseLong(amountString);
        }else{//String has decimal point.
            dollarsString = amountString.substring(0,pointLocation); //remove string after period.
            centsString = amountString.substring(pointLocation+1);//returns string after the period.
            //one digit in cents means tenths of a dollar
            if( centsString.length()<=1 ){ 
                centsString = centsString + "0"; 
            }
            //conver to numeric
            dollars = Long.parseLong(dollarsString);
            cents = Long.parseLong(centsString);
            if( (dollars<0) || (cents<0) || (cents>99) ){
                System.out.println("Error: Illegal representation of money.");
                System.exit(0);
            }
        }
    }
//Methods
    public void readInput(){
        System.out.println("Enter amount on a line by itself:");
        Scanner kb = new Scanner(System.in);
        String amount = kb.nextLine();//nextLine instead of line bc there might be space between dollar sign and the number.
        set(amount.trim()); //remove space invoke method.
    }
    public void writeOutput(){
        System.out.print("$"+dollars);
        if(cents<10){
            System.out.print(".0"+cents);
        }else{
            System.out.print("."+cents);
        }
    }
    /**
     * Returns n times the calling object.
     */
    public Money times(int n){ //multiplying money objects by number n.
        Money product = new Money();
        product.cents = n*cents;
        long carryDollars = product.cents/100;
        product.cents = product.cents%100;
        product.dollars = n*dollars+carryDollars;
        return product;
    }
    public Money add(Money otherAmount){
        Money sum = new Money(); //needs to create new object ot hold added values.
        sum.cents = this.cents +  otherAmount.cents;
        long carryDollars = sum.cents%100;
        sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
        return sum; //object with sum variables.
    }
}