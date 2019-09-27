package myproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class customer {

    private int age;
    private String fname;
    private String lname;
    private company company;
    Scanner input = new Scanner(System.in);
    private List orders = new ArrayList();

    public customer() {
    }

    public customer(String fname, String lname, int age) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void viewOrders() {
        for (Object i : orders) {
            System.out.println(i);
        }
    }

    public void Order() {
        while (true) {
            System.out.print("Select Medicine: ");
            String a = input.nextLine();
            Object s = a;
            if (company.getAllergy().contains(a) || company.getBodyPain().contains(a) || company.getCough().contains(a) || company.getHeadAche().contains(a)) {
                orders.add(a);
            }else{
                System.out.println("Invalid input");
            }
        }
    }

}
