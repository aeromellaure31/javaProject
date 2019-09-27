package myproject;

import java.util.Scanner;

public class MyProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        login log = new login();
//        log.question();
//        

//        System.out.println("");
//
//        System.out.println("\t\t\t\tWelcome to Aero's Medicine\n");
        company comp = new company();
        customer cust = new customer();
        Cough c = new Cough("robitossin", 50);
        Cough c1 = new Cough("delsym", 70);
        Cough c2 = new Cough("dextromethorphan", 100);
        Headache h = new Headache("biogesic", 80);
        Headache h1 = new Headache("aspirin", 60);
        Headache h2 = new Headache("ibuprofen", 65);
        BodyPain b = new BodyPain("acetaminophin", 90);
        BodyPain b1 = new BodyPain("tolmetin", 95);
        BodyPain b2 = new BodyPain("naproxen", 80);
        Allergies a = new Allergies("clemastine", 75);
        Allergies a1 = new Allergies("carbinoxamine", 65);
        Allergies a2 = new Allergies("hydroxyzine", 55);
        System.out.println();
        comp.addCoughMedicine(c);
        comp.addCoughMedicine(c1);
        comp.addCoughMedicine(c2);
        comp.addbodyPainMedicine(h);
        comp.addbodyPainMedicine(h1);
        comp.addbodyPainMedicine(h2);
        comp.addheadAcheMedicine(b);
        comp.addheadAcheMedicine(b1);
        comp.addheadAcheMedicine(b2);
        comp.addAllergyMedicine(a);
        comp.addAllergyMedicine(a1);
        comp.addAllergyMedicine(a2);
        comp.addPriceCough(c.getPriceRob());
        comp.addPriceCough(c1.getPriceRob());
        comp.addPriceCough(c2.getPriceRob());
        comp.addPriceHeadAche(h.getPriceBio());
        comp.addPriceHeadAche(h1.getPriceBio());
        comp.addPriceHeadAche(h2.getPriceBio());
        comp.addPriceBodyPain(b.getPriceAce());
        comp.addPriceBodyPain(b1.getPriceAce());
        comp.addPriceBodyPain(b2.getPriceAce());
        comp.addPriceAllergy(a.getPriceCle());
        comp.addPriceAllergy(a1.getPriceCle());
        comp.addPriceAllergy(a2.getPriceCle());

        System.out.print("Press 1 to Order\nPress 2 to View Orders\nPress 3 to Exit\nPress 4 to View Available Medicine\nPress 5 to exit");
        System.out.println("");
        String x = input.nextLine();
        if (x.equals("1")) {
            cust.Order();
        } else if (x.equals("2")) {
            cust.viewOrders();
        } else if (x.equals("3")) {
            
        } else if (x.equals("4")) {
            comp.showAllMedicine();
        } else if(x.equals("5")){
            System.out.println("Invalid Key");
        }

//        System.out.println("");
//        m.age();
//        while (true) {
//            System.out.print("\nDo you want to order? : ");
//            String z = input.next();
//            if (z.equals("yes")) {
//                m.inputMedicine();
//            } else if (z.equals("no")) {
//                System.out.println("You can now exit");
//                m.viewMedicine();
//                break;
//            }
//        }
    }

}
