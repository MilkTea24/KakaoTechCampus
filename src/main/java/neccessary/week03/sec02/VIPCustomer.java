package neccessary.week03.sec02;

class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;


    public VIPCustomer(int customerID, String customerName, int bonusPoint) {
        super(customerID, customerName, bonusPoint);
        System.out.println("VIPCustomer() 생성자 호출");
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        int resultPrice = price - (int)(price * salesRatio);
        return resultPrice;
    }

    public int getAgentID() {
        return agentID;
    }

}
