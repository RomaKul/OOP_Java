public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        while(true){
        int count=0;
        for(int i=0;i<length-1;i++){
            int q=array[i];
            if(array[i]>array[i+1]){
                array[i]=array[i+1];
                array[i+1]=q;
                count++;
            }
        }
        if(count==0)
        break;
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}        