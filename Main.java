import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Get current date for testing
        LocalDate today = LocalDate.now(); //ask from 3rd year
        int currentYear = today.getYear(); //ask from 3rd year (to make their birthday be the date that code is run)
        int currentMonth = today.getMonthValue(); //ask from 3rd year
        int currentDay = today.getDayOfMonth(); //ask from 3rd year

        System.out.println("Today's date is " + today + "\n");

        // Original users (not their birthday today)
        User john = new User("John", 1954, 2, 18);
        john.displayInfo();
        john.displayHappyBirthday(); // Won't display anything since it's not his birthday

        Admin nicolas = new Admin("Nicolas", 1964, 4, 22);
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        // ^^^ in class lesson

        // *** homework task
        nicolas.displayHappyBirthday(); // Won't display anything since it's not his birthday

        System.out.println("\n=== Testing Birthday Features ===");

        // Create users with today's date as birthday for testing
        User birthdayUser = new User("Khaimook", 2006, currentMonth, currentDay); //every time when run this part its gonna be my birthday
        System.out.println("\nTesting User birthday:");
        birthdayUser.displayInfo();
        birthdayUser.displayHappyBirthday(); // Should display happy birthday message

        Admin birthdayAdmin = new Admin("P'Papop", 2004, currentMonth, currentDay);
        System.out.println("\nTesting Admin birthday:");
        birthdayAdmin.displayInfo();
        birthdayAdmin.displayHappyBirthday(); // Should display happy birthday message with age

        // Test with different dates to show non-birthday case
        System.out.println("\n=== Non-Birthday Test ===");
        User nonBirthdayUser = new User("Bambam Got7", 1997, 5, 2); // May 2nd
        nonBirthdayUser.displayHappyBirthday(); // Should not display anything

        Admin nonBirthdayAdmin = new Admin("Jaemin NCT", 2000, 12, 25); // December 25th
        nonBirthdayAdmin.displayHappyBirthday(); // Should not display anything
    }
}
