package Expense_Tracker_Miniproject;

import java.io.FileReader;
import java.util.Properties;
import java.util.Scanner;

public class authentic_check {
    public static boolean login()  {
        try {
            FileReader a = new FileReader("expense_checking.properties");
            Properties p=new Properties();
            p.load(a);
            for (int i = 0; i < 3; i++) {
                System.out.println("enter user id");
                Scanner sc=new Scanner(System.in);
                String id=sc.next();
                System.out.println("enter passsword");
                String c=sc.next();
                if (p.getProperty("user").equals(id) &&  p.getProperty("password").equals(c) ){
                    System.out.println("login successfully");
                    return true; // ✅ login success
                }
                else{
                    System.out.println("Wrong credentials");
                }

            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        return false; // ❌ login fail
    }
}
