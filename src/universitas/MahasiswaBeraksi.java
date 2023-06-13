/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author valdi
 */
    public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Muhammad Valdi Erlangga", "Informatika", "2110010163");
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Prodi: " + mhs.getProdi());
        System.out.println("Nim: " + mhs.getNim());
    }
}

