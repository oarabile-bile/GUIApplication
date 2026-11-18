/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapplication;

/**
 *
 * @author Student
 */
public class ProductCalculations implements IProductCalculations {

    private double price;

    public ProductCalculations(double price) {
        this.price = price;
    }

    @Override
    public double GetVat() {
        return price * 0.15; // 15% of product price[cite: 25]
    }

    @Override
    public double GetCommission() {
        return price * 0.05; // 5% of product price[cite: 25]
    }

    @Override
    public double GetTotal() {
        return price + GetVat() + GetCommission(); // Price + VAT + Commission[cite: 25]
    }
}
