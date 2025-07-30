import java.time.LocalDate;

public class Admin extends User {
    public Admin(String name, int year, int month, int date){
        super(name, year, month, date);
    }

    @Override // ทบทวนoverride ให้เข้าใจกว่านี้ด้วย
    public void displayInfo(){
        super.displayInfo();
        System.out.println("User type: admin");
    }

    public void displayInfo(boolean full) {
        if(full) {
            this.displayInfo();
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println(this.getName());
        }
    }

    // Override displayHappyBirthday to include age
    @Override
    public void displayHappyBirthday() {
        int age = LocalDate.now().getYear() - getDob().getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.getName() +
                    "! You are " + age + "!");
        }
    }
}
