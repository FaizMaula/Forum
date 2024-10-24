/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forum5;

/**
 *
 * @author fmaul
 */
public class Sayap {
    private int panjang;
    public Sayap(int panjang){
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }
    
    public void infoSayap(){
        System.out.println(" memiliki sayap dengan panjang " + panjang );
    }
}
