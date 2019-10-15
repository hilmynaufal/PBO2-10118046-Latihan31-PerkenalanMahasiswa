/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118046.latihan31.perkenalanmahasiswa;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    
    private String nim, nama;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void perkenalkanDiri() {
        System.out.println("\nHallo Everyone");
        System.out.println("My NIM is " + nim);
        System.out.println("My name is " + nama);
    }
}
