public class MatrixPrint {
    public static void main(String args[]){
        int size =5;
        for(int i=1;i<=size*size;i++){
            if(i==1 || i==5 || i==7|| i==9 || i==13 || i==17 || i==19 || i==21 || i==25){
                System.out.print(" * ");
            }
            else if (i<9){
                System.out.print(" " + i +" ");
            }
            else{
                System.out.print(i+" ");
            }
            if(i%size==0){
                System.out.println();
            }
        }
    }
}