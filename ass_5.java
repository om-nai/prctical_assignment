import java.util.*;

class checking extends Account {

}

class Saving extends Account {
    static int dr = 5000;

    void draft() {
        System.out.println("Enter the Amount you want to Withdraw : ");
        double with = sc.nextDouble();
        if (with > balance) {
            System.out.println("Account have insufficient balance!!!");
        } else {
            if (with <= dr) {
                balance = balance - with;
                System.out.println("The updated balnce is : " + balance);
            } else {
                System.out.println("Over Draft Limit exeed!!!!!");
            }
        }
    }

    class ass_5{
        public static void main(String[] args) {
            Scanner t = new Scanner(System.in);
            Account a = new Account();
            Saving s = new Saving();
            System.out.println("The Account Creation Date is : ");
            System.out.println(a.date.toString());
            System.out.println();
            a.data();
            for (int i = 1; i >= 1; i++) {
                System.out.println("Enter Your Input : ");
                int k = t.nextInt();
                switch (k) {
                    case 1:
                        a.deposit();
                        a.data();
                        continue;
                    case 2:
                        s.draft();
                        a.data();
                        continue;
                    case 3:
                        a.getMonthlyInterestRate();
                        a.data();
                        continue;
                    default:
                        System.out.println(":: 404 The Error Accurs ::");
                }
            }
            t.close();
        }
    }
}