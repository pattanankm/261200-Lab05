public class Main {
    public static void main(String[] args) {
        User john = new User("John",1954,2,18);
        john.displayInfo();

        Admin nicolas = new Admin("Nicolas",1964,4,22);
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);


    }
}
