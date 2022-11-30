package Assignment_4;

public class UniqueChars {

    public static void main(String[] args) {
            String s="The quick brown fox jumps over the lazy dog";
        
        if(unique(s)) {
            System.out.println("Unique string");
        }
        else
            System.out.println("Not a Unique string");
    }

    private static boolean unique(String s) {
         
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++) {
                if(s.charAt(i)==s.charAt(j))
                    //if duplicates are present then given string is not unique.
                    return false;
            }
            
        }
        return true;
    }

}
