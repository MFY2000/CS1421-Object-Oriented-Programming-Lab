import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

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
        ponit[Question] = ans ? true : false;
        System.out.println("Your Answer is"+(ans ? " Correct" : " Wrong"));
    }

    public void InputTake(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Answeer number: "+Question+"\nEnter: ");
        UserAnswer[Question] = scan.nextLine();
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

class NumericQuestion extends MultipleChoiceQuestion{

    public NumericQuestion(boolean way){
        super(way);
    }

    public void check(){

        double v1 = Double.parseDouble(UserAnswer[Question]);
        double v2 = Double.parseDouble(Answer[Question]);

        boolean ans = Math.abs(v1 - v2) <= 0.01;

        ponit[Question] = ans ? true : false;
        System.out.println("Your Answer is "+ (ans ? " Correct" : " Wrong"));
    }
}

class StringQuestion extends MultipleChoiceQuestion{

    public StringQuestion(boolean way){
        super(way);
    }

    public void check(){
        boolean ans = Answer[Question].replaceAll("\\s+","").toLowerCase().equals(UserAnswer[Question].replaceAll("\\s+","").toLowerCase());;

        ponit[Question] = ans ? true : false;
        System.out.println("Your Answer is"+ (ans ? " Correct" : " Wrong"));
    }
}



public class Practice_Tasks2{
    public static void main(String[] args) {
        MultipleChoiceQuestion Quiz1 = new MultipleChoiceQuestion(true);
        Quiz1.ways();

        System.out.println("Now we are going to Modify the method 'Check()'\nAll the Question are related to Numeric");
        NumericQuestion Quiz2 = new NumericQuestion(!true);
        Quiz2.ways();

        System.out.println("All the Question are related to string");
        StringQuestion Quiz3 = new StringQuestion(true);
        Quiz3.ways();

    }
}