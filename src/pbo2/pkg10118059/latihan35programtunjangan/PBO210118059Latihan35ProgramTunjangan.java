/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan35programtunjangan;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class PBO210118059Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Karyawan krywn = new Karyawan();
        
        System.out.println("========Program Tunjangan=======");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        krywn.setGaji(input.nextDouble());
        
        System.out.print("Status Anda ? (Menikah/Belum) : ");
        krywn.setStatus(input.next());
        
        krywn.tampilHasilPerhitungan();
    }
    
}
