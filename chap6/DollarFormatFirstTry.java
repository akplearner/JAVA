//listing 6.13
public class DollarFormatFirstTry{
    public static void write(double amount){
        int allCents=(int)(Math.round(amount*100));
        int dollars=allCents/100;
        int cents=allCents%100;

        System.out.print("$"+ dollars +".");

        if(cents<10 && cents>=0 ){
            System.out.println(" 0 "+cents);
        }else{
            System.out.println(cents);
        }
    }
    public static void writeLn(double amount){//next Line output
        write(amount);
        System.out.println();
    }

}