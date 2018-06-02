public class test{
    private int var1;
    public test(){
        var1=0;
    }
    public test(int newVar){
        var1=newVar;
    }
    public int getVar(){
        return var1;
    }

    public static void main(String[] args){
        test testing = new test(5);
        System.out.println("result is "+testing.getVar());
    }
}