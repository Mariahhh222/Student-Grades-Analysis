import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in the decimal grades of the students in your class. Enter 'done' when finshed");
        ArrayList<Double> arr = new ArrayList<>();
        while (scan.hasNext()) {
            String input = scan.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                double scanned = Double.parseDouble(input);
                arr.add(scanned);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number or 'done' to finish.");
            }
        }
        if (!arr.isEmpty()) {
            System.out.println("Total average is: " + returnAv(arr));
            System.out.println("Highest Grade: " + returnHighest(arr));
            System.out.println("Lowest Grade: " + returnLowest(arr));
        } else {
            System.out.println("No grades entered.Please enter decimal values");
        }
        scan.close();
    }

    public static double returnAv(ArrayList<Double> arr) {
        double totalVa = 0;
        for (double i : arr) {
            totalVa += i;
        }
        return totalVa / arr.size();
    }

    public static double returnHighest(ArrayList<Double> arr) {
        double highest = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > highest) {
                highest = arr.get(i);
            }
        }
        return highest;
    }

    public static double returnLowest(ArrayList<Double> arr) {
        double lowest = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < lowest) {
                lowest = arr.get(i);
            }
        }
        return lowest;
    }
}
