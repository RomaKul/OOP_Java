package com.tasks6.rle;

public class Application
{
    public static void main( String[] args )
    {
    String str = args[0];
    int leng=str.length();
    int count=1;
    
    int len=str.length();
    char[] array=new char[len+1];
    
    for(int i=0;len>i;i++){
      array[i]=str.charAt(i);
    }
    array[len]=' ';   
    for(int i =0;i<leng;i++){
      char q=array[i];
      if(count==9){
        System.out.print(q+""+9);
        count=1;
      }
      else if(q==array[i+1]){
        count++;
      }else if(count==1){
        System.out.print(q);
      }else{
        System.out.print(q +""+ count);
        count=1;
      }
    }
    System.out.println("");    
    }
}      
      