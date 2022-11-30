package Assignment_4;

public class PanagramCheck {

    public static void main(String[] args) {
        
        String s="The quick brown fox jumps over the lazy dog";
        
        if(panagram(s)) {
            System.out.println("Panagaram");
        }
        else
            System.out.println("Not a Panagram");
    }

    private static boolean panagram(String s) {
         
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                return true;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z')
                return true;
        }
        return false;
    }
    

}
