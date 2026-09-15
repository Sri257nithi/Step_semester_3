package string.assigment_problems;

import java.util.Scanner;

public class TrafficSignalStreakAnalyzer {

    static void findLongestStreak(String signalLog) {

        int currentCount = 1;
        int longestCount = 1;
        char longestSignal = signalLog.charAt(0);

        for (int i = 1; i < signalLog.length(); i++) {

            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > longestCount) {
                longestCount = currentCount;
                longestSignal = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + longestSignal
                + "' repeated " + longestCount + " times");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic signal log: ");
        String signalLog = sc.nextLine();

        findLongestStreak(signalLog);

        sc.close();
    }
}