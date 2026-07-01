package lv.bootcamp.a1;


public class Main {
    public static final float PASS_SCORE = 75;
    static float highestAverage = 0;

    public static void main() {
        int[][] studentMarks = {
                {82, 76, 88, 82, 99},
                {80, 70, 55, 37, 90},
                {22, 80, 100, 66, 89},
                {80, 70, 45, 80, 78},
                {80, 89, 55, 37, 55},
        };

        int studentCount = studentMarks.length;

        for (int i = 0; i < studentCount; i++) {
            float average = calculateAverage(studentMarks[i]);

            if (average > highestAverage) {
                highestAverage = average;
            }

            String status = studentStatus(average) ? "PASS" : "FAIL";
            System.out.printf("%n Score average of student %d = %.2f and Garde of student = %s", i + 1, average, status);
        }
        System.out.printf("%n%nHighest Average Score in class is = %.2f", highestAverage);
    }


    /**
     * Return the average mark from the array of marks
     *
     * @param marks array of marks
     * @return float average score
     */
    public static float calculateAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return (float) sum / marks.length;
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
}