public class Chocolate extends Product{


    private String chocolateTaste = "";

    public Chocolate(String name, double price, String chocolateTaste) {
        super(name, price);
        this.setChocolateTaste(chocolateTaste);
    }
    public String getChocolateTaste() {
        return chocolateTaste;
    }

    public void setChocolateTaste(String chocolateTaste) {
        this.chocolateTaste = chocolateTaste;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", super.toString(), chocolateTaste);
    }

}