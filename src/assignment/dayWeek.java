package assignment;
import java.util.Scanner;

public class dayWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer between 1 and 7: ");
        int dayNumber = scanner.nextInt();
        
        
        String[] daysOfWeek = {
            "Invalid input. Please enter a number between 1 and 7.",
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        
        
        String day;
        if (dayNumber >= 1 && dayNumber <= 7) {
            day = daysOfWeek[dayNumber];
        } else {
            day = daysOfWeek[0];
        }
        
        
        System.out.println(day);
        
        
        scanner.close();
    }
}
