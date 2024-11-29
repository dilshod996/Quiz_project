package org.example.quetions;

import java.util.Scanner;

public class QuestionService {
    Question[] question= new Question[5];
    public int result;

    public QuestionService() {
        question[0] = new Question(1, "Which language unity use?", new String[]{"java", "csharp", "cpp", "python"}, "csharp");
        question[1] = new Question(2, "Which language unreal engine use?", new String[]{"java", "csharp", "cpp", "python"}, "cpp");
        question[2] = new Question(3, "Which language spider use?", new String[]{"java", "csharp", "cpp", "python"}, "python");
        question[3] = new Question(4, "Which language spring use?", new String[]{"java", "csharp", "cpp", "python"}, "java");
        question[4] = new Question(5, "Who is the best UCHL goal scorer?", new String[]{"Ronaldo", "Neymar", "Levandowski", "Messi"}, "Ronaldo");
    }
    String[] selection = new String[5];

    public void displayQuestion(){
        for(Question q:question){
            System.out.println("Question num:  " + q.getId());
            System.out.println(q.getQuestion());
            displayOptions(q.getOptions());
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();

            selection[q.getId()-1] = answer;
            try {
                if(answer.equals(q.getAnswer())){
                    result++;
                }
                else{
                    System.out.println("Wrong answer " + q.getAnswer());
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Your result is: " + result);
        for(String ans: selection){
            System.out.println(ans);
        }
    }
    public void displayOptions(String[] options){
        for(int i= 0; i<options.length; i++){
            int counter = i+1;
            System.out.println(counter + ". "+ options[i]);
        }
    }
}
