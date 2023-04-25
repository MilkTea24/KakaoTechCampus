package neccessary.week03.sec06.exam02;

class GoldCustomer extends Customer {
    double salesRatio;
    public GoldCustomer(int customerID, String customerName, int bonusPoint) {
        super(customerID, customerName, bonusPoint);

        salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
