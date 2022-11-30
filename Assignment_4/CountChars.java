package Assignment_4;

public class CountChars {
        public static void main(String[] args) {
            String s="iNeuron@[]";
            String vowels="aeiouAEIOU";
            String specialChars="!@#$%^&*()_+~`';<>?/[],.|";
            StringBuffer vowelsCount=new StringBuffer();
            StringBuffer specialCount=new StringBuffer();
            StringBuffer consonantCount=new StringBuffer();
            
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                
                
                if(vowels.indexOf(ch)!=-1) {
                    vowelsCount.append(ch);
                }
                else if(specialChars.indexOf(ch)!=-1){
                    specialCount.append(ch);
                }
                else {
                    consonantCount.append(ch);
                }
                
                    
            }
            
            System.out.println("Vowels are :("+vowelsCount +") with Length "+vowelsCount.length());
            
            System.out.println("Consonants are :("+consonantCount +") with Length "+vowelsCount.length());
            System.out.println("Special are :("+specialCount +") Charaters with Length "+vowelsCount.length());
            
            
        }
}
