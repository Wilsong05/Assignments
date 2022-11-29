 

public class MergeSort {

    public static void main(String[] args) {
        int[] a= {23,32 ,23 ,24};
        
        divide(a,0,a.length-1);
        
        for(int i:a)
            System.out.print(i+" ");
    }

    private static void divide(int[] a, int l, int h) {
         if(l<h)
         {
             int mid=l+(h-l)/2;
             
             divide(a,l,mid);
             divide(a,mid+1,h);
             conquer(a,l,mid,h);
         }
        
    }

    private static void conquer(int[] a, int l, int mid, int h) {
          
        int merged[] =new int[(h-l)+1];
        int idx=l; 
        int jdx=mid+1; 
        int x=0;
        
        while(idx<=mid && jdx<=h)
        {
            if(a[idx]<a[jdx])
                merged[x++]=a[idx++];
            else
                merged[x++]=a[jdx++];
        }
        while(idx<=mid)
        {
            merged[x++]=a[idx++];
        }
        while(jdx<=h)
        {
            merged[x++]=a[jdx++];
        }
        
        for(int i=0,j=l;i<merged.length;i++,j++)
            a[j]=merged[i];
    }

}
