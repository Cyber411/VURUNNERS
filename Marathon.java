/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package question_2.marathon;

/**
 *
 * @author USER
 */
public class Marathon {
    public static void main(String[] args) {
        // List of runner names
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", 
            "Matt", "Alex", "Emma", "John", "James", 
            "Jane", "Emily", "Daniel", "Neda", "AaronT", "Kate"
        };

        // List of runner times in minutes
        int[] times = {
            341, 273, 278, 329, 445, 
            402, 388, 275, 243, 334, 
            412, 393, 299, 343, 317, 265
        };

        // Variables to hold the fastest and second fastest times and their indices
        int fastestTimeIndex = 0;
        int secondFastestTimeIndex = 0;

        // Initialize fastest and second fastest times
        int fastestTime = times[0];
        int secondFastestTime = Integer.MAX_VALUE;

        // Find the fastest runner
        for (int i = 1; i < times.length; i++) {
            if (times[i] < fastestTime) {
                secondFastestTime = fastestTime;
                secondFastestTimeIndex = fastestTimeIndex;
                fastestTime = times[i];
                fastestTimeIndex = i;
              //second fastest runner  
            } else if (times[i] < secondFastestTime && times[i] != fastestTime) {
                secondFastestTime = times[i];
                secondFastestTimeIndex = i;
            }
        }

        // Print the fastest runner
        System.out.println("Fastest runner: " + names[fastestTimeIndex] + " with a time of " + fastestTime + " minutes.");

        // Print the second fastest runner
        System.out.println("Second fastest runner: " + names[secondFastestTimeIndex] + " with a time of " + secondFastestTime + " minutes.");
    }
}