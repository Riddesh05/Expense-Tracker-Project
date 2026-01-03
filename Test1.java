package Expense_Tracker_Miniproject;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        boolean isLogin = authentic_check.login();

        if (!isLogin) {
            System.out.println("Access denied. Program closed.");
            return; // program stop
        }

        expenseManager5 l=new expenseManager5();
        Scanner sc=new Scanner(System.in);
        int z;
        do {
            System.out.println("1.add expense");
            System.out.println("2.view expense");
            System.out.println("3.update expense");
            System.out.println("4.delete expense");
            System.out.println("5. Serach expense");
            System.out.println("6.total amount in expense");
            System.out.println("enter your chocie");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    l.addd_expense();
                    break;
                case 2:
                    l.displayy_service();
                    break;
                case 3:
                    l.update_expense();
                    break;
                case 4:
                    l.delete_expense();
                    break;
                case 5:
                    l.search_expense();
                    break;
                case 6:
                    l.total_expense();
                    break;
                default:
                    System.out.println("invalid choice");

            }
            System.out.println("do u want to continue 1/0");
            z = sc.nextInt();
        }while (z==1);
    }
}
