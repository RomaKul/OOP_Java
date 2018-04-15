public class ShellSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;
        
        int inner, outer, temp, interval=1;
        while(interval<=length/3)
            interval=interval*3+1;
            while(interval>0){
                for(outer=interval;outer<length;outer++){
                    temp=array[outer];
                    inner=outer;
                    while(inner>interval-1 && array[inner-interval]>=temp){
                        array[inner]=array[inner-interval];
                        inner-=interval;
                    }
                    array[inner]=temp;
                }
                interval=(interval-1)/3;
            }
        
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}       