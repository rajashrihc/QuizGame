import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import java.util.Random;

public class QuziApp {
    public static void main(String[] args) {
        // Using arrays for questions, choices, and correct answers
        String[] questions = {
            "Who is the father of Computers?",
            "What is the full form of CPU?",
            "Which of the following computer language is written in binary codes only?"
        };

        String[][] choices = {
            {"A) James Gosling", "B) Charles Babbage", "C) Dennis Ritchie", "D) Bjarne Stroustrup"},
            {"A) Computer Processing Unit", "B) Computer Principle Unit", "C) Central Processing Unit", "D) Control Processing Unit"},
            {"A) pascal", "B) machine language", "C) C", "D) C#"}
        };

        char[] correctAnswers = {'B', 'C', 'B'};

        // Alternatively, you can use ArrayLists
        ArrayList<String> questionsList = new ArrayList<>();
        ArrayList<ArrayList<String>> choicesList = new ArrayList<>();
        ArrayList<Character> correctAnswersList = new ArrayList<>();
        // System.out.println(getRandomValue(questions));
        // System.out.println(getRandomValue(questions));
        
     questionsList.add("What is the capital of France?");
        choicesList.add(new ArrayList<>(List.of("A) London", "B) Paris", "C) Berlin", "D) Madrid")));
        correctAnswersList.add('B');

        questionsList.add("Which planet is known as the Red Planet?");
        choicesList.add(new ArrayList<>(List.of("A) Venus", "B) Mars", "C) Jupiter", "D) Saturn")));
        correctAnswersList.add('B');

        questionsList.add("Who wrote 'Romeo and Juliet'?");
        choicesList.add(new ArrayList<>(List.of("A) Charles Dickens", "B) William Shakespeare", "C) Jane Austen", "D) Mark Twain")));
        correctAnswersList.add('B');

        // Now, you can implement the quiz logic using these data structures
        conductQuiz(questions, choices, correctAnswers);
        // or
        // conductQuiz(questionsList, choicesList, correctAnswersList);
    }
    // public static int getRandomValue(String[] array){
    //     String result=new Random().next(array[i]);
    //     return array[result];
    // }

    public static void conductQuiz(String[] questions, String[][] choices, char[] correctAnswers) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            // Display the question
            System.out.println(questions[i]);

            // Display choices
            for (String choice : choices[i]) {
                System.out.println(choice);
            }

            // Get the user's answer
            System.out.print("Your answer: ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            // Check if the answer is correct
            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".\n");
            }
        }

        // Display the final score
        System.out.println("Your final score is: " + score + " out of " + questions.length);
    }

    // Alternatively, you can use overloaded methods for ArrayLists
}
