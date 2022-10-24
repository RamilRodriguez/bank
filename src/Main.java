public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Alpha");
        User user = new User("Ivanov", "Ivan", 100);
        bank.menu(user);

    }
}
