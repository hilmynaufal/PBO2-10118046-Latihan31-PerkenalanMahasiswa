/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118046.latihan31.perkenalanmahasiswa;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : membuat program pengenalan diri berbasis objek
 */
public class PBO210118046Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        Mahasiswa mhs4 = new Mahasiswa();
        mhs1.setNim("100110269"); mhs1.setNama("Rizki Adam Kurniawan");
        mhs2.setNim("100110270"); mhs2.setNama("Indra Tiola");
        mhs3.setNim("100110271"); mhs3.setNama("Robi Tanzil Ganefi");
        mhs4.setNim("100110269"); mhs4.setNama("Muhammad Nur Awaludin");
        mhs1.perkenalkanDiri();
        mhs2.perkenalkanDiri();
        mhs3.perkenalkanDiri();
        mhs4.perkenalkanDiri();
    }

}
