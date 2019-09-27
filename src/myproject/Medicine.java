package myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Medicine {

//    public Headache headache = new Headache("biogesic", "aspirin", "ibuprofen", 6, 4, 2);
//    public BodyPain bodyPain = new BodyPain("acetaminophin", "naproxen", "tolmetin", 9, 7, 8);
//    public Cough cough = new Cough("robitossin", "delsym", "dextromethorphan", 5, 10, 7);
//    public Allergies allergy = new Allergies("clemastine", "carbinoxamine", "hydroxyzine", 6, 3, 5);
    private ArrayList<String> medic = new ArrayList();
    Scanner input = new Scanner(System.in);
    double totalPrice = 0;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getMedic() {
        return medic;
    }

    public void setMedic(ArrayList<String> medic) {
        this.medic = medic;
    }
    
    public void age(){
        System.out.print("age: ");
        age = input.nextInt();
    }

    public void inputMedicine() {
        System.out.print("Choose medicine: ");
        String y = input.next();
        medic.add(y);
        System.out.print("How many " + y + " : ");
        String a = input.next();
//        medic.add(a);
//        if (y.equals("robitossin")) {
//            totalPrice += (Integer.parseInt(a) * cough.getPriceRob());
//        } else if (y.equals("delsym")) {
//            totalPrice += (Integer.parseInt(a) * cough.getPriceDel());
//        } else if (y.equals("dextromethorphan")) {
//            totalPrice += (Integer.parseInt(a) * cough.getPriceDex());
//        } else if (y.equals("clemastine")) {
//            totalPrice += (Integer.parseInt(a) * allergy.getPriceCle());
//        } else if (y.equals("carbinoxamine")) {
//            totalPrice += (Integer.parseInt(a) * allergy.getPriceCar());
//        } else if (y.equals("tolmetin")) {
//            totalPrice += (Integer.parseInt(a) * allergy.getPriceHyd());
//        } else if (y.equals("acetaminophin")) {
//            totalPrice += (Integer.parseInt(a) * bodyPain.getPriceAce());
//        } else if (y.equals("naproxen")) {
//            totalPrice += (Integer.parseInt(a) * bodyPain.getPriceNap());
//        } else if (y.equals("tolmetin")) {
//            totalPrice += (Integer.parseInt(a) * bodyPain.getPriceTol());
//        } else if (y.equals("biogesic")) {
//            totalPrice += (Integer.parseInt(a) * headache.getPriceBio());
//        } else if (y.equals("aspirin")) {
//            totalPrice += (Integer.parseInt(a) * headache.getPriceAsp());
//        } else if (y.equals("ibuprofen")) {
//            totalPrice += (Integer.parseInt(a) * headache.getPriceIbu());
//        }
    }

    public void viewMedicine() {
        System.out.println("\nYour order:");
        if (getMedic().size() == 0) {
            System.out.println("Thanks for visiting");
        } else {
            for (String f : getMedic()) {
                System.out.print(f + " ");
                if (getMedic().indexOf(f) % 2 != 0) {
                    System.out.println("");
                }
            }
            if (getAge() >= 65) {
                System.out.println("Your Total Price is " + (totalPrice - (totalPrice * (0.20))) + " pesos");
            } else if (getAge() < 65) {
                System.out.println("Your Total Price is " + totalPrice + " pesos");
            }
        }
    }

    public String out() {
        return String.format("   Sickness %50s", "Available Medicine");
    }
}
