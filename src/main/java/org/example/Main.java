package org.example;

import org.example.quetions.Question;
import org.example.quetions.QuestionService;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
       // questionService.displayQuestion(new Question(1, "Which word explains greetings", new String[]{"hello", "bye", "notall"}, "hello"));
        questionService.displayQuestion();
    }
}