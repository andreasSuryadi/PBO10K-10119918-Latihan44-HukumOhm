/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan44hukumohm;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitungan hukum ohm menggunakan
 * sistem enakpsulasi dan getter setter
 *
 */

public class PBO10K10119918Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai baterai = new Baterai();
        
        Baterai baterai2 = new Baterai(3.0f, 12.0f);
        System.out.printf("%nKuat Arus : %.1f ampere%n", baterai2.getKuatArus());
        System.out.printf("Hambatan : %.1f ohm%n", baterai2.getHambatan());
        System.out.printf("Hasil Tegangan : %.1f volt%n", baterai2.hitungTegangan());
    }
    
}
