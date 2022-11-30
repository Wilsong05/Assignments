package Assignment_4;


public class PalindromCheck {

    public static void main(String[] args) {
         int a = 2552;
         
         int rem=0,rev=0;
         int temp=a;
         
         while(a>0) {
             rem=a%10;
             rev=rev*10+rem;
             a=a/10; 
             
         }
         
         if(rev==temp)
             System.out.println("The Given Number Is "+rev+" Palindrom!");
         
         else
             System.out.println("Not a Palindrom!");

    }

}
