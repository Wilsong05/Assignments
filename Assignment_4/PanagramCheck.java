package Assignment_4;

public class PanagramCheck {

    public static void main(String[] args) {
        
        String s="wilsong";
        
        s.replace(" ", "");
        s=s.toUpperCase();
        
        if(panagram(s)) {
            System.out.println("Panagaram");
        }
        else
            System.out.println("Not a Panagram");
    }

    private static boolean panagram(String s) {
         
        char[] ch =s.toCharArray();
        
        char[] temp =new char[26];
        
        for(int i=0;i<ch.length;i++)
        {
            temp[ch[i]-65]++;
        }
        
        for(int j=0;j<ch.length;j++)
            if(temp[j]!=1)
                return false;
        
        return true;
    }
    

}
