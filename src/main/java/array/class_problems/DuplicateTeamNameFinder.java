
package array.class_problems;

import java.util.Scanner;

public class DuplicateTeamNameFinder {

    static String findDuplicateTeam(String[] teamNames) {

        for (int i = 0; i < teamNames.length; i++) {

            for (int j = i + 1; j < teamNames.length; j++) {

                if (teamNames[i].equals(teamNames[j])) {
                    return teamNames[i];
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teams: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] teamNames = new String[n];

        System.out.println("Enter team names:");

        for (int i = 0; i < n; i++) {
            teamNames[i] = sc.nextLine();
        }

        String duplicate = findDuplicateTeam(teamNames);

        if (duplicate != null) {
            System.out.println("Duplicate Found: " + duplicate);
        } else {
            System.out.println("No duplicates found");
        }

        sc.close();
    }
}
