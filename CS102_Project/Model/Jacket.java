package Model;


public class Jacket extends Product {

    private static final int UNIT_TYPE = 2;

    public Jacket(String name, double price, String productDesc) {
        super(name, price, UNIT_TYPE);
        super.setProductDesc(productDesc);
    }

    public Jacket(String name, double price) {
        super(name, price, UNIT_TYPE);
        super.setProductDesc("Description not mentioned.");
    }
    public String toString() {
        return getProductDesc() + " " +
                getProductName() + ", " +
                getProductPrice() + " TL " +
                getUnitType() + ".";
    }
}
