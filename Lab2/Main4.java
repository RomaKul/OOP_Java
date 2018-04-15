public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;
        int size =data.length/2;
        int var=0;
        while(1==1){
            if(data[size]==numberToFind){     
                System.out.println(size);
                break;
            }
            else if(size==var){
                System.out.println("-1");
                return;
            }
            else if(data[size]<numberToFind){
                size/=2;
            }
            else if (data[size]>numberToFind){
                size=size+size/2;
            }
        }
    }
}
      