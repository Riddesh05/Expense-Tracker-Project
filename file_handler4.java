package Expense_Tracker_Miniproject;

import java.io.*;
import java.util.ArrayList;

public class file_handler4 {
    static File myfile = new File("expense_2.txt");

    public static ArrayList<expensepojo> reaadfile() {
        ArrayList<expensepojo> l1 = new ArrayList<>();
        if (!myfile.exists() || myfile.length() == 0) {
            System.out.println("No data available.");
            return l1;
        }
//        BufferedReader br = new BufferedReader(new FileReader(myfile))
        try  {
            FileReader a=new FileReader(myfile);
            BufferedReader br=new BufferedReader(a);
            String line;

            while ((line = br.readLine()) != null) {

                String[] arr = line.split(",");

                int id = Integer.parseInt(arr[0]);//converted string to integer
                String owner=arr[1];
                int amount = Integer.parseInt(arr[2]);
                String category = arr[3];
                String description = arr[4];
                String date = arr[5];

                // IMPORTANT: tumhara constructor match karo
//                expensepojo obj = new expensepojo(owner,id, amount, category, description, date);
//
//                l1.add(obj);
                System.out.println("ID: " + id);
                System.out.println("OWNER: "+owner);
                System.out.println("Amount: " + amount);
                System.out.println("Category: " + category);
                System.out.println("Description: " + description);
                System.out.println("Date: " + date);
                System.out.println("-------------------------");


            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return l1;
    }

    public static void wrrite_file(ArrayList<expensepojo> data) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(myfile))) {

            for (expensepojo e : data) {
                // CSV format: id,amount,category,description,date
                String line = e.getExpense_id() + "," +e.getOwner_name()+","+
                        e.getAmount() + "," +
                        e.getCategory() + "," +
                        e.getDescription() + "," +
                        e.getDate();
                bw.write(line);
                bw.newLine();
                bw.flush();
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }




}
