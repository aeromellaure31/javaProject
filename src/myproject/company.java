package myproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class company {
    private List<Illness> cough = new ArrayList<Illness>();
    private List<Illness> allergy = new ArrayList<Illness>();
    private List<Illness> headAche = new ArrayList<Illness>();
    private List<Illness> bodyPain = new ArrayList<Illness>();
    private List<Illness> allMedicine = new ArrayList<Illness>();
    private List<Integer> priceCough = new ArrayList<Integer>();
    private List<Integer> priceAllergy = new ArrayList<Integer>();
    private List<Integer> priceBodyPain = new ArrayList<Integer>();
    private List<Integer> priceHeadAche = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);

    public List<Illness> getCough() {
        return cough;
    }

    public void setCough(List<Illness> cough) {
        this.cough = cough;
    }

    public List<Illness> getAllergy() {
        return allergy;
    }

    public void setAllergy(List<Illness> allergy) {
        this.allergy = allergy;
    }

    public List<Illness> getHeadAche() {
        return headAche;
    }

    public void setHeadAche(List<Illness> headAche) {
        this.headAche = headAche;
    }

    public List<Illness> getBodyPain() {
        return bodyPain;
    }

    public void setBodyPain(List<Illness> bodyPain) {
        this.bodyPain = bodyPain;
    }

    public void addCoughMedicine(Illness ill) {
        cough.add(ill);
        allMedicine.add(ill);
    }

    public void addbodyPainMedicine(Illness ill) {
        bodyPain.add(ill);
        allMedicine.add(ill);
    }

    public void addAllergyMedicine(Illness ill) {
        allergy.add(ill);
        allMedicine.add(ill);
    }

    public void addheadAcheMedicine(Illness ill) {
        headAche.add(ill);
        allMedicine.add(ill);
    }

    public void coughMedicineOutput() {
        System.out.printf("Cough");
        for (Illness i : cough) {
            if (cough.indexOf(i) == 0) {
                System.out.printf("%20s", "");
                System.out.printf("%s %38s", i, Integer.toString(priceCough.get(cough.indexOf(i))));
            } else if (cough.indexOf(i) == 2) {
                System.out.printf("%25s", "");
                System.out.printf("%s %33s", i, Integer.toString(priceCough.get(cough.indexOf(i))));
            } else {
                System.out.printf("%25s", "");
                System.out.printf("%s %42s", i, Integer.toString(priceCough.get(cough.indexOf(i))));
            }
            System.out.println("\n");
        }
        System.out.println("");
    }

    public void allergyMedicineOutput() {
        System.out.printf("Allergy");
        for (Illness i : allergy) {
            if (allergy.indexOf(i) == 0) {
                System.out.printf("%18s", "");
                System.out.printf("%s %38s", i, Integer.toString(priceAllergy.get(allergy.indexOf(i))));
            } else if (allergy.indexOf(i) == 2) {
                System.out.printf("%25s", "");
                System.out.printf("%s %37s", i, Integer.toString(priceAllergy.get(allergy.indexOf(i))));
            } else {
                System.out.printf("%25s", "");
                System.out.printf("%s %35s", i, Integer.toString(priceAllergy.get(allergy.indexOf(i))));
            }
            System.out.println("\n");
        }
        System.out.println("");
    }

    public void bodyPainMedicineOutput() {
        System.out.printf("Body Pain");
        for (Illness i : bodyPain) {
            if (bodyPain.indexOf(i) == 0) {
                System.out.printf("%16s", "");
                System.out.printf("%s %40s", i, Integer.toString(priceBodyPain.get(bodyPain.indexOf(i))));
            } else if (bodyPain.indexOf(i) == 2) {
                System.out.printf("%25s", "");
                System.out.printf("%s %39s", i, Integer.toString(priceBodyPain.get(bodyPain.indexOf(i))));
            } else {
                System.out.printf("%25s", "");
                System.out.printf("%s %41s", i, Integer.toString(priceBodyPain.get(bodyPain.indexOf(i))));
            }
            System.out.println("\n");
        }
        System.out.println("");
    }

    public void headAcheMedicineOutput() {
        System.out.printf("Headache");
        for (Illness i : headAche) {
            if (headAche.indexOf(i) == 0) {
                System.out.printf("%17s", "");
                System.out.printf("%s %35s", i, Integer.toString(priceHeadAche.get(headAche.indexOf(i))));
            } else if (headAche.indexOf(i) == 2) {
                System.out.printf("%25s", "");
                System.out.printf("%s %40s", i, Integer.toString(priceHeadAche.get(headAche.indexOf(i))));
            } else {
                System.out.printf("%25s", "");
                System.out.printf("%s %40s", i, Integer.toString(priceHeadAche.get(headAche.indexOf(i))));
            }
            System.out.println("\n");
        }
        System.out.println("");
    }

    public void addPriceCough(int price) {
        priceCough.add(price);
    }

    public void addPriceHeadAche(int price) {
        priceHeadAche.add(price);
    }

    public void addPriceAllergy(int price) {
        priceAllergy.add(price);
    }

    public void addPriceBodyPain(int price) {
        priceBodyPain.add(price);
    }

    public void getpriceCough() {
        for (int i : priceCough) {
            System.out.println(i);
        }
    }

    public void showAllMedicine() {
        System.out.printf("%s %25s %37s", "DESCRIPTION", "BRAND NAME", "PRICE");
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
        coughMedicineOutput();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
        allergyMedicineOutput();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
        bodyPainMedicineOutput();
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
        headAcheMedicineOutput();
    }    
}
