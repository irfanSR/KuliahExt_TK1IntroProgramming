/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tk1introprogramming;

import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class TK1IntroProgramming {

    public static void main(String[] args) {
//        Define Scanner

        Scanner scjmlorg = new Scanner(System.in);
        Scanner scatasNama = new Scanner(System.in);

//        Declare empty Array of Menu
        Menu[] arr;

        arr = new Menu[5];

        arr[0] = new Menu("Nasi Goreng Spesial", 9999.99);
        arr[1] = new Menu("Ayam Bakar Spesial", 12345.67);
        arr[2] = new Menu("Stik Sirloin Spesial", 21108.40);
        arr[3] = new Menu("Kwetiaw Siram Spesial", 13579.13);
        arr[4] = new Menu("Kambing Guling Spesial", 98765.43);

        System.out.println("");

        System.out.println("Selamat siang...");
        System.out.println("Pesanan untuk berapa orang  : ");
        int jmlorg = scjmlorg.nextInt();

        System.out.println("Pesanan atas nama           : ");
        String atasnama = scatasNama.nextLine();

        System.out.println("Menu Spesial Hari ini");
        System.out.println("=====================");

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+". " + arr[i].nama + "\t Rp. " + arr[i].harga) ;
        }
    }
}

class Menu {

    public String nama;
    public double harga;

    // Student class constructor
    Menu(String nama, double harga) {
        this.harga = harga;
        this.nama = nama;
    }

    // display() method to display
    // the student data
    public void display() {
        System.out.println("Harga Menu is: " + harga + " "
                + "and Menu name is: "
                + nama);
        System.out.println();
    }
}
