public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int admission = 1300;
        int bonus = admission / 100;
        int result;
        if (admission > 1000) {

            System.out.println("баланс " + (balance + admission + bonus));
            System.out.println("бонусы " + bonus);

        } else {
            System.out.println("баланс " + (balance + admission));

        }
    }

}
