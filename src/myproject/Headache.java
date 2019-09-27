
package myproject;

public class Headache extends Illness{
    private String biogesic;
    private int priceBio;

    public Headache(String biogesic, int priceBio) {
        this.biogesic = biogesic;
        this.priceBio = priceBio;
    }

    public int getPriceBio() {
        return priceBio;
    }

    public void setPriceBio(int priceBio) {
        this.priceBio = priceBio;
    }

    public String getBiogesic() {
        return biogesic;
    }

    public void setBiogesic(String biogesic) {
        this.biogesic = biogesic;
    }
    
    public int myPrice(){
        return priceBio;
    }

    @Override
    public String toString() {
        return biogesic;
    }
}
