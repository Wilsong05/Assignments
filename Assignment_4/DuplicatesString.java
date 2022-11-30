package Assignment_4;

public class DuplicatesString {

    public static void main(String[] args) {
         String s1="javaTpoint is awesome";
         StringBuffer s2=new StringBuffer();
         
         for(int i=0;i<s1.length();i++)
         {
             boolean f=false;
             for(int j=i+1;j<s1.length();j++) {
                  if(s1.charAt(i)==s1.charAt(j))
                 {
                      f=true; 
                      break;
                 }
               
         }
             if(!f)
                 s2.append(s1.charAt(i));
 
         }
         System.out.println(s2);

    }

}


 