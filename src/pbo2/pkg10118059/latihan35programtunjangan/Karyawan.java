/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan35programtunjangan;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class Karyawan {
    private double gaji;
    private String status;
    
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    private double hitungTunjangan(){
        return status.equals("Menikah")?gaji*0.35:0;
    }
    
    private double hitungGajiTotal(){
        return gaji + hitungTunjangan();        
    }
    
    public void tampilHasilPerhitungan(){
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t\t: Rp " + gaji);
        System.out.println("Tunjangan\t\t: Rp " + hitungTunjangan());
        System.out.println("Total Gaji\t\t: Rp " + hitungGajiTotal());
    }
}
