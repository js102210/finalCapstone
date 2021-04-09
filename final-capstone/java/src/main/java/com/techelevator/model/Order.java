package com.techelevator.model;

import java.math.BigDecimal;


public class    Order {
    private int orderID;
    private String orderStatus;
    private BigDecimal orderPriceTotal;
    private String orderDatePlaced;
    private String orderPickupDate;
    private String orderPickupTime;
    private CakeItemDTO[] itemsInOrder;
    private String customerName;
    private String customerPhoneNumber;

    /**
     * Constructor for Order
     * @param orderID int
     * @param orderStatus String
     * @param orderPriceTotal BigDecimal
     * @param  orderDatePlaced LocalDate
     * @param orderPickupDate LocalDate
     * @param orderPickupTime LocalTime 
     * @param itemsInOrder CakeItems[]
     * @param customerName String
     * @param customerPhoneNumber String
     */
    public Order(int orderID, String orderStatus, BigDecimal orderPriceTotal, String orderDatePlaced, String orderPickupDate,
                 String orderPickupTime, CakeItemDTO[] itemsInOrder, String customerName, String customerPhoneNumber){
        this.orderID = orderID;
        this.orderStatus = orderStatus;
        this.orderPriceTotal = orderPriceTotal;
        this.orderDatePlaced = orderDatePlaced;
        this.orderPickupDate = orderPickupDate;
        this.orderPickupTime = orderPickupTime;
        this.itemsInOrder = itemsInOrder;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;

    }
<<<<<<< HEAD

    /**
     * Future self: is this a workaround Constructor or a best practice?
     */
    public Order (){

    }
    public int getOrderId() {
        return orderId;
=======
    public int getOrderID() {
        return orderID;
>>>>>>> 68978c0fba87c2bef4ddbcfad10a8340f78655e7
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getOrderPriceTotal() {
        return orderPriceTotal;
    }

    public void setOrderPriceTotal(BigDecimal orderPriceTotal) {
        this.orderPriceTotal = orderPriceTotal;
    }

    public String getOrderDatePlaced() {
        return orderDatePlaced;
    }

    public void setOrderDatePlaced(String orderDatePlaced) {
    this.orderDatePlaced = orderDatePlaced;
    }

    public String getOrderPickupDate() {
        return orderPickupDate;
    }

    public void setOrderPickupDate(String orderPickupDate) {
        this.orderPickupDate = orderPickupDate;
    }

    public String getOrderPickupTime() {
        return orderPickupTime;
    }

    public void setOrderPickupTime(String orderPickupTime) {
        this.orderPickupTime = orderPickupTime;
    }

    public CakeItemDTO[] getItemsInOrder() {
        return itemsInOrder;
    }

    public void setItemsInOrder(CakeItemDTO[] itemsInOrder) {
        this.itemsInOrder = itemsInOrder;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }




}
