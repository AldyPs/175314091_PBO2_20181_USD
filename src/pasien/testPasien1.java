/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
public class testPasien1 {

    public static void main(String[] args) {
        Pasien cek = new Pasien("aldy");
        
        cek.setTanggalLahir(1999, 11, 15);
        cek.setNama("Aldy Pamungkas");
        cek.setAlamat("Jogjakarta");
        cek.setTempatLahir("Palangka Raya");
        
        cek.nomorRekamMedis();
        System.out.println("Umur            : " + cek.getUsia());
        System.out.println("Nama            : " + cek.getNama());
        System.out.println("Tempat lahir    : " + cek.getTempatLahir());
        System.out.println("Alamat          : " + cek.getAlamat());
       
    }
}
