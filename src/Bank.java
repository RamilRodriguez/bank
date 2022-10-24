import java.util.Scanner;

public class Bank {
    int balanc = 1_000_000;
    String nameOfBank;

    Scanner sc = new Scanner(System.in);

    public Bank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public void menu(User user) {
        System.out.println("Ваш баланс : " + user.balanceOfUser);
        System.out.println("Баланс банка : " + balanc);
        System.out.println("1 - Получить сумму");
        System.out.println("2 - Положить сумму в банк");
        System.out.println("3 - Выйти");

        String x = sc.nextLine();
        switch (x) {
            case "1":
                getOfBalanceOfUser(user);
                break;
            case "2":
                replishmentOfBalanceOfUser(user);
                break;
            case "3":
                System.exit(0);
                break;
            default:
                System.out.println("Неверные данные");
                menu(user);
        }
    }

    public void getOfBalanceOfUser(User user) {
        System.out.println("Какую сумму вы хотите получить?");
        Scanner sc = new Scanner(System.in);
        int summ = sc.nextInt();
        if (summ > balanc) {
            System.out.println("Операция невозможна, попробуйте ввести сумму поменьше");
        } else {
            user.balanceOfUser += summ;
            balanc -= summ;
        }
        menu(user);
    }

    public void replishmentOfBalanceOfUser(User user) {
        System.out.println("Какую сумму вы внести на счет банка?");
        Scanner sc = new Scanner(System.in);
        int summ = sc.nextInt();
        if (summ < balanc) {
            System.out.println("Операция невозможна, попробуйте ввести сумму поменьше");
        } else {
            user.balanceOfUser -= summ;
            balanc += summ;
        }
        menu(user);

    }
}
