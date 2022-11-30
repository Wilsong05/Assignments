package Assignment_4;

public class MaxOccurrenceChars {

    public static void main(String[] args) {
         String s="AABBCCC";
                
          char c=maxoccurrence(s);
          System.out.println("The Max Occurred  Charater is : "+c);
     }

    private static char maxoccurrence(String s) {
        int[] count=new int[256];
        int max=0;
        char ans = 0;
        
         for(int i=0;i<s.length();i++)
         { 
             count[s.charAt(i)]++;
             
             if(count[s.charAt(i)]>max)
             {
                 max=count[s.charAt(i)];
                 ans=s.charAt(i);
             
             }
         }
         
         return ans;
         
          
         
         
          
       
    }

     
        
  }

 
