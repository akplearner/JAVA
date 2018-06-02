public class avg{
    public static void main(String[] args){
        int x = 8246;
        int sum = 0;
        int count = 0;
        while(x>0){
            count++;
            sum += x%10;
            x=x/10;
        }
        System.out.println(sum);
        double avg =sum/count;
        System.out.println(avg);
    }
}