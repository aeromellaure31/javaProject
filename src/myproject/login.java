package myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class login {
    public company company = new company();
    Scanner input = new Scanner(System.in);
    ArrayList<String> list = new ArrayList();

    public void question() {
        System.out.print("Sign up or login? : ");
        String a = input.next();
        System.out.println("");
        if (a.equals("login")) {
            login();
        } else if (a.equals("signup")) {
            signUp();
            System.out.println("You have now an Account\n");
            System.out.println("-----Open Account-----");
            login();
        } else {
            System.out.println("Invalid input!!!");
            question();
        }
    }

    public void login() {
        System.out.print("User name: ");
        String x = input.next();
        System.out.print("Password: ");
        String y = input.next();
        if (list.contains(x) && list.contains(y)) {
            
        } else if (list.contains(x) || list.contains(y)) {
            System.out.println("Invalid password or user name\n");
            login();
        } else {
            System.out.println("Account does not exist");
            login();
        }
    }

    public void signUp() {
        System.out.print("name: ");
        String z = input.next();
        System.out.print("User name: ");
        String x = input.next();
        list.add(x);
        System.out.print("Password: ");
        String y = input.next();
        list.add(y);
    }

    public void view() {
        System.out.println(list);
    }

}
