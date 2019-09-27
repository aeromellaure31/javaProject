
package myproject;

public class Allergies extends Illness {
    private String clemastine;
    private int priceCle;

    public Allergies(String clemastine, int priceCle) {
        this.clemastine = clemastine;
        this.priceCle = priceCle;
    }

    public int getPriceCle() {
        return priceCle;
    }

    public void setPriceCle(int priceCle) {
        this.priceCle = priceCle;
    }

    public String getClemastine() {
        return clemastine;
    }
    
    public int myPrice(){
        return priceCle;
    }

    @Override
    public String toString() {
        return clemastine;
    }
}
