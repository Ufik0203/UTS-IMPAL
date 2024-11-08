/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_2c;

/**
 *
 * @author mario
 */
public class Uts_2c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Kasir membuat objek order
        Order order = new Order(1);

        // Produk dibuat
        Produk produk = new Produk(101, 15000); // ID 101, harga 15000

        // Loop sesuai jumlah produk yang ingin ditambahkan
        OrderDetail orderDetail = new OrderDetail(1, produk);
        orderDetail.setId(1);
        orderDetail.setQuantity(101, 3); // ID produk dan kuantitas

        // Menambahkan OrderDetail ke Order
        order.addOrderDetail(orderDetail);

        // Menghitung total
        order.calculateTotal();

        // Printer mencetak struk
        Printer printer = new Printer();
        order.cetakStruk(printer);

        // Memuat data jika diperlukan
        order.loadData();
    }
    
}
