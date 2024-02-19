package Application;

import Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
    }

    public void bookProduct(float deliveryCharges) {
        System.out.println("Charges of bookProduct: " + getCharges());
        System.out.println("Your total delivery Charges: " + deliveryCharges);
    }

    @Override
    public String toString() {
        return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }

}
