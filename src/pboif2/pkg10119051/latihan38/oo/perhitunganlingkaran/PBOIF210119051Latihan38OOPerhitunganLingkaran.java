/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan38.oo.perhitunganlingkaran;

import data.Rumus;
import java.util.Scanner;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program perhitungan lingkaran
 */
public class PBOIF210119051Latihan38OOPerhitunganLingkaran {

    
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
         Rumus rum = new Rumus();
         
        System.out.println("=====Perhitungan Lingkaran=====");
        do{
        System.out.print("Masukan Nilai diameter Lingkaran :");
        rum.konversiAngka = input.next();
        rum.validasiAngka();
        }while (!rum.kondisi);
        
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = "+rum.hitungJariJari() + " cm");
        System.out.println("Luas Lingkaran = "+rum.hitungLuas() + " cm");
        System.out.println("Keliling Lingkaran = "+rum.hitungKeliling() + " cm");
    }
}
    

