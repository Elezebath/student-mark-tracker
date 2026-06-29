package lv.bootcamp.a1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static final float PASS_SCORE = 75;

    public static void main(String[] args) {
        int[][] studentMarks = {
                {82, 76, 88, 82, 99},
                {80, 70, 55, 37, 90},
                {22, 80, 100, 66, 89},
                {80, 70, 45, 80, 78},
                {80, 89, 55, 37, 55},
        };

        int studentCount = studentMarks.length;
        float[] studentAverageScores = new float[studentCount];
        float average;
        String status;
        for (int i = 0; i < studentCount; i++) {
            average = average(studentMarks[i]);
            studentAverageScores[i] = average;
            status = studentStatus(average) ? "PASS" : "FAIL";
            System.out.printf("%n Score average of student %d = %.2f and Garde of student = %s", i + 1, average, status);
        }
        System.out.printf("%n%nHighest Average Score in class is = %.2f", highestAverageScore(studentAverageScores));
    }


    /**
     * Return the average mark from the array of marks
     *
     * @param marks array of marks
     * @return float average score
     */
    public static float average(int[] marks) {
        float sum = 0;
        float average = 0;
        for (int mark : marks) {
            sum += mark;
        }

        average = sum / marks.length;
        return average;
    }

    /**
     * Get pass or fail status from the score
     *
     * @param mark mark of the student
     * @return pass or fail status of student
     */
    public static boolean studentStatus(float mark) {
        return mark >= PASS_SCORE;
    }

    /**
     * Returns the highest score in the given array.
     *
     * @param scores an array of scores
     * @return the highest score in the array
     */
    public static float highestAverageScore(float[] scores) {
        int length = scores.length;
        if (length == 0) {
            return 0;
        }
        float[] clone = Arrays.copyOf(scores, length);
        Arrays.sort(clone);
        return clone[length - 1];
    }
}