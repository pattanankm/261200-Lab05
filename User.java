import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

    public User(){
        name = null;
        dob = LocalDate.now();
    }

    public User(String name, int year, int month, int date){
        this.name = name;
        this.dob = LocalDate.of(year, month, date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.dob);
    }

    // New method to check if today is user's birthday
    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == dob.getMonth() &&
                today.getDayOfMonth() == dob.getDayOfMonth();
    }

    // New method to display happy birthday message
    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }
}
