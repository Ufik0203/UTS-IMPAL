/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_2c;

/**
 *
 * @author mario
 */
public class OrderDetail {
    private int id;
    private int quantity;
    private double subTotal;
    private Produk produk;

    public OrderDetail(int id, Produk produk) {
        this.id = id;
        this.produk = produk;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int id, int qty) {
        this.quantity = qty;
        double price = produk.getPrice(id); // Memanggil getPrice dari Produk
        subTotal(price); // Menghitung subtotal
    }

    private void subTotal(double price) {
        this.subTotal = price * this.quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }
}

