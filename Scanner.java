import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
      String q1 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
      String q2 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
      String q3 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
      String q4 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
      String q5 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
      String q6 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
      String q7 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
      String q8 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
      String q9 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";
      String q10 = "What color are apples?\n" + "(a)red/green\n(b)Orange\n(c)Magenta\n";

      Questions [] question = {
          new Question(q1, "a"),
          new Question(q2, "a"),
          new Question(q3, "a"),
          new Question(q4, "a"),
          new Question(q5, "a"),
          new Question(q6, "a"),
          new Question(q7, "a"),
          new Question(q8, "a"),
          new Question(q9, "a"),
          new Question(q10, "a")
      };
      takeTest(questions);
    }
        
    
    public static void takeTest(Question [] questions){
        int score = 0;
        Scanner A = new Scanner(System.in);
        
        for(int i = 0; 1 < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = A.nextLine();
            if(answer.equals(questions[i]answer)){
                score++;
            }
        }
        System.out.println("You got" + score + "/" + questions.length);
    }
}