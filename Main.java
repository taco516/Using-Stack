import java.util.*;
import java.util.Stack;

public class Main
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String s;
   
      //Prompt User
      System.out.println("Enter a sentence:");
      s = scan.nextLine();
      String[] line;
      line = s.split("\\.");
      System.out.println("");
      for (int i = 0; i <line.length; i++)
      {
       stringRev(line[i]);
      }
   }
   
public static void stringRev(String OrgString)
   {
    int i;
    String temp;
     Stack <String> Stack1 = new Stack <String>();
      String[] temp1;
      String delimit1 = " ";
      OrgString = OrgString.trim();
      temp1 = OrgString.split(delimit1);
      for (i = 0; i < temp1.length; i++)
      {
         Stack1.push(temp1[i]);
      }
      i = 0;
      while(!Stack1.empty()){
         if (i == 0)
         {
            temp = Stack1.pop();
            temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);
         }
         else if(i == (temp1.length-1))
         {
            temp = Stack1.pop();
            temp = temp.toLowerCase();
         }
         else
         temp = Stack1.pop();
  
         System.out.print(temp);
         System.out.print(" ");
         i = i+1;
      }
      System.out.print(".");
   }
}
