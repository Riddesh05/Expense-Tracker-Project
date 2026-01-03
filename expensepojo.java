package Expense_Tracker_Miniproject;

import java.io.Serializable;

public class expensepojo extends expens1  {
    private int expense_id;
    private int amount;
    private String Category;
    private String description;
    private String date;

//
//    public expensepojo(){
//        super();
//
//    }

    public expensepojo(String w,int f,int a,String b,String c,String d){
        super(w);
        this.expense_id=f;
        this.amount=a;
        this.Category=b;
        this.description=c;
        this.date=d;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getExpense_id() {
        return expense_id;
    }

    public void setExpense_id(int expense_id) {
        this.expense_id = expense_id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "expensepojo{" +
                "Owner_name='" + Owner_name + '\'' +
                ", date='" + date + '\'' +
                ", description='" + description + '\'' +
                ", Category='" + Category + '\'' +
                ", amount=" + amount +
                ", expense_id=" + expense_id +
                '}';
    }
}
