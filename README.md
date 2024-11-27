import java.util.Scanner;


public class ShortQuiz {

public static void main(String[]args){

	String[] questions={
	"If the day after tomorrow is three days before Friday, what day is it today?\nA) Sunday B) Wednesday C) Yesterday D) Friday",
            "Which number is the least?\nA) -269 B) -1 C) 0 D) -2.69",
            "If you add -2 to 1, what do you get?\nA) -3 B) 2 C) -1 D) 1",
            "How many months have 30 days?\nA) 6 B) 7 C) 8 D) 11",
            "In a standard deck of cards, how many hearts are there?\nA) 12 B) 13 C) 14 D) 15"
        };

 char[] answers = {'A', 'A', 'C', 'D', 'B'};
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(questions[i]);
            char userAnswer = scanner.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score += 5;
            } else {
                System.out.println("Wrong!");
                score -= 1;
            }
        }
        System.out.println("Your total score is: " + score);
    }
}
