/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5;

/**
 *
 * @author fmaul
 */
public class DokterHewan {

    private String nama;
    private String spesialis;

    public DokterHewan(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String getNama() {
        return this.nama;
    }

    public String getSpesialis() {
        return this.spesialis;
    }

    public void periksaHewan(Hewan hewan) {
        System.out.println("Dokter " + nama + " memeriksa " + hewan.nama);

    }
}
