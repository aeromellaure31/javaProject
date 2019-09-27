
package myproject;

import java.util.ArrayList;

public class Cough extends Illness {
    private String robitussin;
    private int priceRob;

    public Cough(String robitussin, int priceRob) {
        this.robitussin = robitussin;
        this.priceRob = priceRob;
    }

    public int getPriceRob() {
        return priceRob;
    }

    public void setPriceRob(int priceRob) {
        this.priceRob = priceRob;
    }

    public String getRobitussin() {
        return robitussin;
    }

    public void setRobitussin(String robitussin) {
        this.robitussin = robitussin;
    }
    
    public int myPrice(){
        return priceRob;
    }

    @Override
    public String toString() {
        return this.robitussin;
    }
   
}
