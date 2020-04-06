import java.util.Scanner;

import sun.security.ec.point.Point;

class AnwserKey{
    private String[] AnswerString = {"Multiple Choice Question","A","J"};
    private String[] AnswerNumeric = {"8.64","12.6","1.23"};

    public String[] getAnswerNumeric() {
        return AnswerNumeric;
    }

    public String[] getAnswerString() {
        return AnswerString;
    }
}

class  MultipleChoiceQuestion extends AnwserKey{
    public String[] Answer = new String[3];
    public String[] UserAnswer = new String[3];
    public boolean[] ponit = new boolean[3];
    public int Question = 0;

    public MultipleChoiceQuestion(boolean way){
       Answer = way ? getAnswerString() : getAnswerNumeric();
    }

    Scanner scan = new Scanner(System.in);

    public void Welcome(){
        System.out.println("Welcome to our Quiz game");
    }

    public void DisplayQuestion(){
        System.out.println("We are going to display Question "+Question);
    }
    public void check(){
        boolean ans = UserAnswer[Question].equals(Answer[Question]);
        Point[Question] = ans ? true : false;   
        System.out.println("Your Answer is"+ ans ? " Correct" : " Wrong");
    }
    
    public void InputTake(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Answeer number: "+Question+"\nEnter: ");
        UserAnswer[Question] = scan.next(); 
    }

    public void ways() {
      Welcome();
      for (var i = 0; i < 3; i++) {
          DisplayQuestion();
          InputTake();
          check();
          Question++;
      }  
    }

}


public class Practice_Tasks2{
    public static void main(String[] args) {
        MultipleChoiceQuestion Quiz1 = new MultipleChoiceQuestion(true);
        Quiz1.ways();
    }
}