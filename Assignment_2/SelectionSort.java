package Assignment_2;


public class SelectionSort
{
   public static void main(String[] args) {
      int[] a={42,32,2,5};
     
      for(int i=0;i<a.length-1;i++)
      {
          int min=i;
         for(int j=i+1;j<a.length;j++){
            if(a[min]>a[j])
                {
                   min=j; 
                }
         }
            
        int temp =a[min];
        a[min]=a[i];
        a[i]=temp;
      }
     
      for(int i:a)
         System.out.print(i+" ");
   }
}
