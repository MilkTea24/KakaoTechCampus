package neccessary.week03.sec02;

public class CustomerExample {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10010, "이순신", 1000);
        int originalPrice = 1000;

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10011, "김유신", 5000);

        System.out.println(customerKim.showCustomerInfo());

        System.out.println("일반 고객의 구매 가격은 " + customerLee.calcPrice(originalPrice) + "원");
        System.out.println("VIP 고객의 구매 가격은 " + customerKim.calcPrice(originalPrice) + "원");
    }
}
