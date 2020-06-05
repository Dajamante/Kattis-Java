import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws java.io.IOException {

        InputReader in = new InputReader();
        String[] logStringArray;
        HashMap<String, Integer> scores = new HashMap<>();


        int solvedProblems = 0;
        int finalScore = 0;


        for (String log = in.nextLine(); !log.equals("-1"); log = in.nextLine()) {

            logStringArray = log.split(" ");
            int timeForProblem = Integer.parseInt(logStringArray[0]);
            String keyLetter = logStringArray[1];
            String rightOrWrong = logStringArray[2];


            if (rightOrWrong.equals("wrong")) {
                processLetterWhenWrong(keyLetter, scores);

            } else {
                solvedProblems++;
                finalScore += processScoreWhenRight(keyLetter, timeForProblem, scores);
            }
        }

        System.out.println(solvedProblems + " " + finalScore);
    }

    private static int processScoreWhenRight(String keyLetter, int timeForProblem, HashMap<String, Integer> scores) {

        if (!scores.containsKey(keyLetter))
            return timeForProblem;
        else if (scores.containsKey(keyLetter)) {
            timeForProblem = scores.get(keyLetter) + timeForProblem;
        }

        return timeForProblem;
    }

    public static void processLetterWhenWrong(String keyLetter, HashMap<String, Integer> scores) {

        if (scores.containsKey(keyLetter)) {
            int howMany = scores.get(keyLetter) + 20;
            scores.put(keyLetter, howMany);
        } else {
            scores.put(keyLetter, 20);
        }
    }
}

