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
public class testPasien1 {
    public static void main(String[] args) {
        Pasien aldy = new Pasien("aldy");
         
        aldy.setTanggalLahir(1999,11,15);
        System.out.println("Umur : " + aldy.getUsia());
    }
}
