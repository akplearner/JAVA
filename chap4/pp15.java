public class pp15{
    public static void main(String[] args) {
        System.out.println("Rand num.");
        int num[]= new int[3];
        for( int i=0 ; i<3  ; i++ ){
            num[i] = (int)(Math.random()*10)+1;
            System.out.println("setNum"+i+":"+num[i]);
        }
        for( int i=0 ; i<3  ; i++ ){
            for(int j=0 ; j<i ; j++){
                if(num[j]==num[i]) {            
                    num[i] = (int)(Math.random()*10)+1;
                    System.out.println("Num["+i+"]:"+num[i]);
                }
            }
        }
    }
}