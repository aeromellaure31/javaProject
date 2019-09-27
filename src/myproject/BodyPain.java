
package myproject;

public class BodyPain extends Illness {
    private String acetaminophin;
    private int priceAce;

    public BodyPain(String acetaminophin, int priceAce) {
        this.acetaminophin = acetaminophin;
        this.priceAce = priceAce;
    }

    public int getPriceAce() {
        return priceAce;
    }

    public void setPriceAce(int priceAce) {
        this.priceAce = priceAce;
    }

    public String getAcetaminophin() {
        return acetaminophin;
    }

    public void setAcetaminophin(String acetaminophin) {
        this.acetaminophin = acetaminophin;
    }
    
    public int myPrice(){
        return priceAce;
    }

    @Override
    public String toString() {
        return acetaminophin;
    }
}
