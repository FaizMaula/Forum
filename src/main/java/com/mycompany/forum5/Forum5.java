/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.forum5;

/**
 *
 * @author fmaul
 */
public class Forum5 {

    public static void main(String[] args) {
        Pemilik Jacob = new Pemilik("Jacob");
        Pemilik Joshua = new Pemilik("Joshua");
        Pemilik Orlando = new Pemilik("Orlando");
        Pemilik Asep = new Pemilik("Asep");
        Hewan kucing = new Hewan("Momo", "Jantan", Jacob, 3);
        Anjing buddy = new Anjing("Pitbull", "Buddy", "Betina", Joshua, 5);
        Kucing brown = new Kucing("Persia", "Brown", "Betina", Orlando, 1);
        Burung lukas = new Burung("Kakatua", "Lukas", "Jantan", Asep, 3);
        DokterHewan Dokter1 = new DokterHewan("Dr.Adnan", "Spesialis Kucing");

        buddy.tambahRiwayatMedis("Vaksin Parvovirus");
        buddy.tambahRiwayatMedis("Operasi kaki");
        
        lukas.tambahRiwayatMedis("Suntik rabies");
        
        kucing.infoHewan();
        System.out.println("--------------");
        
        buddy.infoHewan();
        buddy.tampilkanRiwayatMedis();
        System.out.println("--------------");
        buddy.menggonggong();
        System.out.println("--------------");
        
        brown.infoHewan();
        brown.tampilkanRiwayatMedis();
        System.out.println("--------------");
        
        lukas.infoHewan();
        lukas.tampilkanRiwayatMedis();
        
        Dokter1.periksaHewan(kucing);
    }
}
