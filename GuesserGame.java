 
import java.util.*;

class NumberRange{
      static boolean Inrange(int a)
    {
        if(a>=1 && a<=10)
               return true;
        else
            return false;
    }
 
}

class Guesser
{
    int guessNum;
    int a;
    NumberRange nr=new NumberRange();
    
    int guessNum() 
    {
        Scanner sc =new Scanner(System.in);
        while(true)
        {
            System.out.println("Guesser Enter the Number :");
            a=sc.nextInt();
            if(nr.Inrange(a))
            {  guessNum=a;
               break;
            }
               
           else 
           {
               System.out.println("enter the Number Blw 1 To 10");
               
            }
        }
        return guessNum;
    } 
  }
class Player1 {
int guessNum;
    
    int guessNum() {
        Scanner sc =new Scanner(System.in);
        NumberRange nr=new NumberRange();
        
        int a;
        while(true)
        {
            System.out.println("Player-1 Enter the Number ::");
            a=sc.nextInt();
            if(nr.Inrange(a))
            {  guessNum=a;
               break;
            }
               
           else 
           {
               System.out.println("enter the Number Blw 1 To 10");
               
            }
        }
        return guessNum;
        
    }
}


class Player2 {
int guessNum;
    
    int guessNum() {
        Scanner sc =new Scanner(System.in);
        NumberRange nr=new NumberRange();
        
        int a;
        while(true)
        {
            System.out.println("Player-2 Enter the Number ::");
            a=sc.nextInt();
            if(nr.Inrange(a))
            {  guessNum=a;
               break;
            }
               
           else 
           {
               System.out.println("enter the Number Blw 1 To 10");
               
            }
        }
        return guessNum;
        
    }
}


class Player3 {
int guessNum;
    
    int guessNum() {
        Scanner sc =new Scanner(System.in);
        NumberRange nr=new NumberRange();
        
        int a;
        while(true)
        {
            System.out.println("Player-3 Enter the Number ::");
            a=sc.nextInt();
            if(nr.Inrange(a))
            {  guessNum=a;
               break;
            }
               
           else 
           {
               System.out.println("enter the Number Blw 1 To 10");
               
            }
        }
        return guessNum;
        
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    
    
    void collectFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser =g.guessNum();
    }
    
    void collectFromPlayers()
    {
        Player1 p1=new Player1();
        Player2 p2=new Player2();
        Player3 p3=new Player3();
        numFromPlayer1 =p1.guessNum();
        numFromPlayer2 =p2.guessNum();
        numFromPlayer3 =p3.guessNum();
    }
    
    void compare()
    {
        if(numFromPlayer1==numFromGuesser && numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser)
            System.out.println("All Players Are won!");
        else if(numFromPlayer1==numFromGuesser && numFromPlayer2==numFromGuesser )
            System.out.println("Payer 1 & 2 is won!");
        else if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser )
            System.out.println("Payer 2 & 3 is won!");
        else if(numFromPlayer1==numFromGuesser && numFromPlayer3==numFromGuesser )
            System.out.println("Payer 1 & 3 is won!");
        else if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser )
            System.out.println("Payer 2 & 3 is won!");
        else if(numFromPlayer1==numFromGuesser)
            System.out.println("Payer 1 is won!");
        else if(numFromPlayer2==numFromGuesser)
            System.out.println("Payer 2 is won!");
        else if(numFromPlayer3==numFromGuesser)
            System.out.println("Payer 3 is won!");
        else
            System.out.println("Try Again! Better Luck Next Time :(");
    }
    
}
    
public class GuesserGame {

    public static void main(String[] args) {
         
         Umpire u=new Umpire();
         u.collectFromGuesser();
         u.collectFromPlayers();
         u.compare();
         

    }

}
 
