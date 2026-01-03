package Expense_Tracker_Miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class expenseManager5 implements display_service_interfaces3 {
    Scanner sc=new Scanner(System.in);
    ArrayList<expensepojo> list=new ArrayList<>();
            //file_handler4.reaadfile();

    public  void addd_expense(){
        System.out.println("enter owner name");
        String a1= sc.next();
        System.out.println("enter id");
        int a= sc.nextInt();
        System.out.println("enter amount");
        int amt=sc.nextInt();
        System.out.println("enter category");
        String b=sc.next();
        System.out.println("enter desciption ");
        String d=sc.next();
        System.out.println("enter date");
        String d1= sc.next();

        expensepojo b5=new expensepojo(a1,a,amt,b,d,d1);
        list.add(b5);
        file_handler4.wrrite_file(list);
        System.out.println("expense added");
    }

    @Override
    public void displayy_service() {
        list = file_handler4.reaadfile();  // fresh read from file
        if (list.isEmpty()) {
            System.out.println("No expenses.");
            return;
        }
        for (expensepojo g:list)
            System.out.println(g);

    }

    public void update_expense(){

        System.out.println("1.date Change");
        System.out.println("2.Category Change");
        System.out.println("enter choice");
        int v=sc.nextInt();

        if (v==1){
            System.out.println("enter date ");
            String a3= sc.next();
            for (expensepojo w:list){
                w.setDate(a3);
                System.out.println("date changed");
                System.out.println(w);
                }
            }
        else
            System.out.println("invalid");
        }

        public void delete_expense(){
            System.out.println("enter id to delete");
            int v=sc.nextInt();
            int flag=0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getExpense_id()==v){
                    list.remove(i);
                    flag=1;
                    System.out.println("Deleted successfully!");
                    break;
                }
            }
            if (flag==0){
                System.out.println("invalid id!");
            }
            file_handler4.wrrite_file(list);

        }




        public  void search_expense(){
            System.out.println("enter id you want");
            int id=sc.nextInt();
           for (expensepojo b:list){
               if (b.getExpense_id()==id){
                   System.out.println(b);
               }
           }
        }

        public void total_expense(){
        int sum=0;
            for (int i = 0; i <list.size() ; i++) {
                sum=sum+list.get(i).getAmount();
            }
            System.out.println("total amount of all="+sum);
        }

    }



