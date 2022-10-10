import java.util.*;

class Account 
{
    Scanner sc = new Scanner(System.in);
    int[] acc_array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    double balance = 100;
    double new_balance1;
    double new_balance2;

    public void current_balance() 
    {
        System.out.println("Current balance of your Account : " + balance);
    }

    public void withdraw() 
    {
        System.out.println("How much amount you want to withdraw : ");
        double w = sc.nextDouble();
        new_balance1 = balance - w;
        System.out.println("New balnce of account after withdraw : " + new_balance1);
    }

    public void deposit() 
    {
        System.out.println("How much amount you want to deposit : ");
        double d = sc.nextDouble();
        new_balance2 = balance + d;
        System.out.println("New balance of account after deposit : " + new_balance2);
    }

    public void getdata() 
    {
        System.out.println("Enter ID : ");
        int i = sc.nextInt();
        int retVal = Arrays.binarySearch(acc_array, i);
        boolean res = retVal > 0 ? true : false;
        if (res == true) 
        {
            System.out.println("1: Current balance");
            System.out.println("2: Withdrawing money");
            System.out.println("3: Depositing money");
            System.out.println("4: Exit");
            int j = sc.nextInt();
            switch (j) {
                case 1: 
                {
                    current_balance();
                    break;
                }
                case 2: 
                {
                    withdraw();
                    break;
                }
                case 3: 
                {
                    deposit();
                    break;
                }
                case 4: 
                {
                    System.out.println("Exit the code");
                    break;
                }
                case 99: 
                {
                    System.out.println("Stop the mechine");
                    break;
                }
            }
        } 
        else 
        {
            System.out.println("Enter valid ID number!!!");
        }
    }

}

public class ass_3 
{
    public static void main(String[] args) 
    {
        Account a = new Account();
        Scanner sc = new Scanner(System.in);
        a.getdata();
    }
}