package neccessary.week03.sec06.exam02;

import java.util.ArrayList;

public class CustomerExample {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(10001, "Tomas", 0));
        customerList.add(new Customer(10002, "James", 0));
        customerList.add(new GoldCustomer(10003, "Edward", 0));
        customerList.add(new GoldCustomer(10004, "Percy", 0));
        customerList.add(new VIPCustomer(10005, "Kim", 0));

        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo()); //재정의하지 않은 부모 클래스 메소드
        }
        for (Customer customer : customerList) {
            System.out.println(customer.customerGrade + " 등급에게 적용된 가격은 " + customer.calcPrice(10000) + "원");
            System.out.println(customer.showCustomerInfo());
        }
    }
}
