/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_2c;

/**
 *
 * @author mario
 */
public class Produk {
    private int id;
    private double price;

    public Produk(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public double getPrice(int id) {
        // Asumsikan ID sesuai dan mengembalikan harga produk
        if (this.id == id) {
            return this.price;
        } else {
            return 0.0; // atau lempar exception jika ID tidak cocok
        }
    }
}

