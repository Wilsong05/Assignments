
public class Namepattern
{
  public static void main (String[]args)
  {
    int n = 11;
    for (int i = 0; i < n; i++)
      {
        // W
	for (int j = 0; j < n; j++)
	  {  
	    if (i==n-1 && j>0 &&  j!=(3*n)/8 && j<(3*n)/4 || j==(3*n)/8 && i>(n)/2 && i<(n-1)  || j==0 && i>=0 && i<n-1 || j==(3*n)/4 && i>=0 && i<n-1)
	      System.out.print ("*");
	    else
	      System.out.print (" ");
	  }
	  //I
	  for (int j = 0; j < n; j++)
	  {  
	    if (i==0  && j<(3*n)/4 ||  i== n-1 && j<(3*n)/4 || j==(3*n)/8 && i<n-1)
	      System.out.print ("*");
	    else
	      System.out.print (" ");
	  }
	  //L
	   for (int j = 0; j < n; j++)
	  {  
	    if (i==n-1 && j<(3*n)/4 || j==0 )
	      System.out.print ("*");
	    else
	      System.out.print (" ");
	  }
	  //S
	  for (int j = 0; j < n; j++)
	  {  
	    if (i==0    && j<(3*n)/4 && j>n/4 || j==n/4 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j!=(n-1/2) && j<((5*n)-1)/8  && j>n/4|| j==((5*n)-1)/8 && i>(n-1)/2 && i<n-1 || i==n-1 && j<((5*n)-1)/8 && j>n/16)
	      System.out.print ("*");
	    else
	      System.out.print (" ");
	  }
	  //O
	   for (int j = 0; j < n; j++)
	  {  
	    if (i==0 && j>0 && j<(3*n)/4 || i==n-1 && j>0 && j<(3*n)/4 || j==0 && i>0 && i<(n-1) || j==(3*n)/4 && i>0 && i<(n-1))
	      System.out.print ("*");
	    else
	      System.out.print (" ");
	  }
	  //N
	   for (int j = 0; j < n; j++)
	  {  
	    if (j==0 || j==n-1 || i==j  )
	      System.out.print ("*");
	    else
	      System.out.print (" ");
	  }
	  
       
     //.............................................................................................
   
	   
	   //I
	   for (int j = 0; j < n; j++)
         {  
           if (i==0 && j>1 && j<(n-1) ||  i== n-1  && j>1 && j<(n-1)|| j==(n-1)/2 && i<n-1)
             System.out.print ("*");
           else
             System.out.print (" ");
         }
   
	   
	   //N
         for (int j = 0; j < n; j++)
         {  
           if (j==0 || j==n-1 || i==j  )
             System.out.print ("*");
           else
             System.out.print (" ");
         }
         //E
         for (int j = 0; j < n; j++)
         {  
           if (i==0 && j<(n-1)&& j>0 || i==n-1 && j<(n-1) && j>0 || j==1 && i<n-1 || i==(n-1)/2 && j<n-1 && j>0 )
             System.out.print ("*");
           else
             System.out.print (" ");
         }
         //U
         for (int j = 0; j < n; j++)
         {  
           if (j==0 && i<n-1 || j==n-1 && i!=n-1 || i==n-1 && j<n-1 && j>0 )
             System.out.print ("*");
           else
             System.out.print (" ");
         }
         
         //R
         for (int j = 0; j < n; j++)
         {  
           if (j==1 || i==0 && j>1 && j<(3*n)/4 || i==(n-1)/2 && j>1 && j<=(n-1)/2 || i==j && i>(n-1)/2 || j==(3*n)/4 && i>0 && i<(n-1)/2)
             System.out.print ("*");
           else
             System.out.print (" ");
         }
         //O
         for (int j = 0; j < n; j++)
         {  
           if (i==0 && j>1 && j<(3*n)/4 || i==n-1 && j>1 && j<(3*n)/4 || j==1 && i>0 && i<(n-1) || j==(3*n)/4 && i>0 && i<(n-1))
             System.out.print ("*");
           else
             System.out.print (" ");
         }
         //N
         for (int j = 0; j <=n; j++)
         {  
           if (j==0 || j==n || i==j && i>0  )
             System.out.print ("*");
           else
             System.out.print (" ");
         }
	   
	  
	System.out.println ();
		
      }
    
 
    
  }
}
