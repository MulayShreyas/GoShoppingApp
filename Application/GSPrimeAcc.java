package Application;

import Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges, isPrime);
    }

    public void charges(float charges) {
        System.out.println("charges is: " + charges);
        System.out.println("delivery charges: " + (charges - 500.0f));
    }

    @Override
    public String toString() {
        return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + "]";
    }
}
