/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pasien;

import java.util.Date;

/**
 *
 * @author admin
 */
public class Pasien {

        private String nama,alamat,tempatLahir;
        private Date tanggalLahir;

    public Pasien(String nama, String alamat, String tempatLahir, Date tanggalLahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }

    Pasien(String aldy) {
       
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    void setTanggalLahir(int tahun, int bulan, int tanggal) {
      tanggalLahir = new Date(tahun - 1900, bulan - 1, tanggal);
    }
//    public Date getTanggalLahir(){
//        return tanggalLahir;
//    }
//    public Date getDate(){
//        return 
//    }
    public int getUsia(){
        Date today = new Date();
        return today.getYear() - tanggalLahir.getYear();
    }
        
    
    
}
