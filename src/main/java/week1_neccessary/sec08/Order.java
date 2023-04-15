package week1_neccessary.sec08;

class Order {
    private String orderID;
    private String phoneNumber;
    private String address;
    private String orderDate;
    private String orderTime;
    private int orderPrice;
    private String menuID;

    public Order(String orderID, String phoneNumber, String address, String orderDate, String orderTime, int orderPrice, String menuID) {
        this.orderID = orderID;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuID = menuID;
    }
}
