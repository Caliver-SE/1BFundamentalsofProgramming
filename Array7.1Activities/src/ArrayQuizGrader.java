import java.util.Scanner; // Import Scanner para sa user input

public class ArrayQuizGrader {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Gumawa ng Scanner para tumanggap ng input

        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        // Array ng tamang sagot

        char[] studentAnswers = new char[10];
        // Array na paglalagyan ng sagot ng student

        int score = 0; // Panimulang score

        int passingScore = 7; // Minimum score para pumasa

        System.out.println("===== AUTOMATED QUIZ GRADER =====");
        // Ipakita ang title

        for (int i = 0; i < studentAnswers.length; i++) {
            // Loop para hingin ang sagot sa bawat question

            System.out.print("Enter answer for Question " + (i + 1) + ": ");
            // Humingi ng sagot sa student

            studentAnswers[i] = input.next().toUpperCase().charAt(0);
            // Kunin ang input at gawing uppercase
        }

        for (int i = 0; i < answerKey.length; i++) {
            // Loop para i-check ang mga sagot

            if (studentAnswers[i] == answerKey[i]) {
                score++; // Dagdagan ang score kapag tama

            } else {
                System.out.println("Question " + (i + 1) +
                        ": Incorrect. You answered '" + studentAnswers[i] +
                        "', correct answer is '" + answerKey[i] + "'");
                // Ipakita ang maling sagot at tamang sagot
            }
        }

        System.out.println("\n===== QUIZ RESULTS =====");
        // Ipakita ang results

        System.out.println("Total Questions: " + answerKey.length);
        // Bilang ng questions

        System.out.println("Correct Answers: " + score);
        // Bilang ng tamang sagot

        System.out.println("Wrong Answers: " + (10 - score));
        // Bilang ng maling sagot

        System.out.println("Final Score: " + score + "/10");
        // Final score ng student

        if (score >= passingScore) {
            System.out.println("Result: PASSED");
            // Ipakita kung pumasa

        } else {
            System.out.println("Result: FAILED");
            // Ipakita kung bumagsak
        }

        input.close(); // Isara ang Scanner
    }
}