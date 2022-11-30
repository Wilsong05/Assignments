package Assignment_4;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
         String s1="Ineuron";
         String s2="noroneuI";
         if(anangram(s1,s2))
             System.out.println("Anagram");
         else
             System.out.println("Not a Anagram");
    }

    private static boolean anangram(String s1, String s2) {
         if(s1.length()==s2.length())
         {
             char[] sa=s1.toCharArray();
             char[] sb=s2.toCharArray();
             
             Arrays.sort(sa);
             Arrays.sort(sb);
             
             for(int i=0;i<sa.length;i++)
             {
                 if(sa[i]!=sb[i])
                     return false;
             }
         }
         return true;
    }

}
