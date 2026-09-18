
package array.class_problems;

import java.util.Scanner;

public class RotateArray {

    static void rotate(int[] nums, int k) {

        if (nums.length == 0) {
            return;
        }

        k = k % nums.length;

        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newArray[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArray[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        rotate(nums, k);

        System.out.print("Rotated array: ");

        for (int value : nums) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
