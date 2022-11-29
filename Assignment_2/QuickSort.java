 

public class QuickSort{
    public static void main(String[] args) {
        int[] a= {354,23,1,4};
        
        quickSort(a,0,a.length-1);
        
        for(int i:a)
            System.out.println(i);
    }

    public static void quickSort(int[] a, int l, int h) {
         if(l<h) {
             int pivot=partition(a,l,h);
             quickSort(a,l,pivot-1);
             quickSort(a,pivot+1,h);
            
         }
        
    }

    public static int partition(int[] a, int l, int h) {
         int i=l-1;
         int pivot=a[h];
         
         for(int current=l;current<h;current++)
         {
             if(a[current]<pivot) {
                 i++;
                 //swap
                 int temp=a[current];
                 a[current]=a[i];
                 a[i]=temp;
             }
         }
         i++;
         int temp=a[i];
         a[i]=pivot;
         a[h]=temp;
         
        return i;
    }
}