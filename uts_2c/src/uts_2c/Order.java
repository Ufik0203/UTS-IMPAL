/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_2c;

/**
 *
 * @author mario
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<OrderDetail> orderDetails;
    private double total;

    public Order(int orderId) {
        this.orderId = orderId;
        this.orderDetails = new ArrayList<>();
    }

    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetails.add(orderDetail);
    }

    public void calculateTotal() {
        total = 0;
        for (OrderDetail od : orderDetails) {
            total += od.getSubTotal();
        }
    }

    public double getTotal() {
        return total;
    }

    public void loadData() {
        // Load data yang diperlukan jika ada
    }

    public void cetakStruk(Printer printer) {
        printer.print("Struk\nTotal: " + total);
    }
}

