/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan56.umurbarangantik;

/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : barang antik
 */
public class BarangAntik {
    private final int umur;
    
    public BarangAntik(int umur){
        this.umur = umur;
    }
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
}
