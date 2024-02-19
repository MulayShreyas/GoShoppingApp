package Customer;

import Framework.NormalAcc;
import Framework.PrimeAcc;
import Framework.ShopFactory;

import Application.GSNormalAcc;
import Application.GSPrimeAcc;
import Application.GSShopFactory;

public class customer {
    public static void main(String[] args) {
        ShopFactory sf = new GSShopFactory();

        PrimeAcc pa = new GSPrimeAcc(345432344, "Apurva", 4000, true);
        pa.bookProduct(pa.getCharges());
        pa.toString();

        NormalAcc na = new GSNormalAcc(543452344, "Ritesh", 50000, 10000);
        na.bookProduct(na.getdeliveryCharges());
        na.toString();

    }
}
