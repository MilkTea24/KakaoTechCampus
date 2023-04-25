package neccessary.week03.sec06.exam02;

class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer(int customerID, String customerName, int bonusPoint){
        System.out.println("Customer() 생성자 호출");
        this.customerID = customerID;
        this.customerName = customerName;
        this.bonusPoint = bonusPoint;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
