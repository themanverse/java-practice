import java.util.Scanner;
import java.util.Random;
class SPSGame
{
    Scanner sc = new Scanner(System.in);
    int UserInput()
    {
        int UI=0;
        String Ui="";
        for(int i=0;i>=0;i++)
        { 
           System.out.println("Enter stone, paper or scissor");
           String check=(sc.next()).toLowerCase();
           if(check.equals("paper") || check.equals("scissor")||check.equals("scissors") || check.equals("stone"))
           {
              Ui=check;
              break;
           }
           else
           {
               System.out.println("Please enter a valid input"); 
               continue;
           }
        }
        if(Ui.equals("stone"))
          UI = 0;
        else if(Ui.equals("paper"))
          UI = 1;
        else if(Ui.equals("scissor")||Ui.equals("scissors"))
          UI = 2;
        System.out.println("User chose: "+Ui);
        return UI;
    }
    int ComputerInput()
    {
        int randm;
        Random r=new Random(); 
        randm = r.nextInt(3);
        if(randm==0)
        System.out.println("Computer chose: stone");
        else if(randm==1)
        System.out.println("Computer chose: paper");
        else
        System.out.println("Computer chose: scissor");
        return randm;
    }
    String game()
    {
        String result="";
        int UserIn = UserInput();
        int CompIn = ComputerInput();
        if(UserIn==CompIn)
        result = "draw";
        else if ((UserIn==0 && CompIn==2) || (UserIn==1 && CompIn==0) || (UserIn==2 && CompIn==1))
        result = "win";
        else
        result = "lost" ;
        if(result.equals("draw"))
        System.out.println("draw");
        else
        System.out.println("you "+result);
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SPSGame obj=new SPSGame();
        for(int i=0;i>=0;i++)
        {
            String res=obj.game();
            String con="";
            for(int j=0;j>=0;j++)
            {
                System.out.println("Do you want to continue ? (write yes or no)");
                String check=(sc.next()).toLowerCase();
                if(check.equals("yes")||check.equals("no"))
                {
                    con=check;
                    break;
                }
                else
                {
                    System.out.println("Enter a valid Input");
                    continue;
                }
            }
            if(con.equals("yes"))
            continue;
            else
            break;
        }
    }
}
