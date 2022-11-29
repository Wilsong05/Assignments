 

public class SubSetOfArray {

    
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5};
        int[] b= {2,3,4,6};
        int[] c= {3,4,5};
       
        
        subSet(a,b);
        subSet(a,c);

    }

    private static void subSet(int[] a, int[] b) {
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<a.length;j++)
            { 
                if(b[i]==a[j])
                    count++;
            }
        }
        
        if(count==b.length)
            System.out.println("The Given Array is Subset OF Array :)");
        else
            System.out.println("Not a Subset of Array! :(");
        
    }

}
