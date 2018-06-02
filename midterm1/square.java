public class square{
    public static void main(String[] args){
        System.out.println("****Creating Square with array:");
        int a[] = new int[6];
        for(int i=1; i<=5 ;i++){
            System.out.println(a[i]=i*i);
        }
        //print array
        System.out.print("Array: a={");
        for(int i=1; i<=5 ;i++){
            System.out.print(a[i]+", ");
        }
        System.out.println("}");

        //checking if its a square: it needs to be stored somewhere , in this case its on array.
        for(int j=1; j<6 ; j++){
            if(a[j]==j*j){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        //without storage
        System.out.println("****Square with int variable in loop:");
        for(int i=1; i<=5 ;i++){
            System.out.println(i*i);
        }
        System.out.println("****Square with Math.pow(x):");
        for(int i=1; i<=5 ;i++){
            System.out.println((int)Math.pow(i,2));//int cast bc Math.pow double answer. 
        }

        //sharia
        System.out.println("\n\nSharia example:");
        int[] x={1,4,3,9,16,25};
        for(int i=0; i<=5 ; i++){
            //System.out.println(x[i]+"\t"+Math.sqrt(x[i]));
            if( Math.sqrt(x[i])%1==0 ){
                System.out.println("Perfect sqrt "+ Math.sqrt(x[i])%1 );
            }else{
                System.out.println("Not Perfect sqrt "+ Math.sqrt(x[i])%1 );
            }
        }
    }
}