import java.util.Scanner;

public class Practice_Tasks2
{
   private String text;
   private String answer;
  

   public Question()
   {
       text="";
       answer="";
      
   }
   public static void presentQuestion(Question q)
   {
       q.display();
       System.out.print("Your answer: ");
       Scanner scan = new Scanner(System.in);
       String response =scan.nextLine();
       System.out.println(q.checkAnswer(response));
   }
  
   public void setText(String questionText)
   {
       text=questionText;
   }
  
   public void setAnswer(String correctResponse)
   {
       answer=correctResponse;
   }
  
   public boolean checkAnswer(String response)
   {
      
       return response.replaceAll("\\s+","").toLowerCase().equals(answer.replaceAll("\\s+","").toLowerCase());
   }
  
   public void display()
   {
       System.out.println(text);
   }

}