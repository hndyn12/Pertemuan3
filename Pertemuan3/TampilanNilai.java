/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author X1
 */
public class TampilanNilai {
    public static void main(String[] args) {
        MasterNilai N = new MasterNilai();
        System.out.println("=========================================");
        
        //prosedure
        System.out.println("\t\tHasil Nilai Kelulusan");
        N.kelulusan("Sri Handayani", 90);
        System.out.println("=========================================");
        
        //fungsi
        System.out.println("\t\tHasil Nilai Kelulusan");
        System.out.println(N.nilailulus("Sri handayani", 92, ""));
        System.out.println("=========================================");
        
        //static prosedure
        System.out.println("\t\tHasil Nilai Kelulusan");
        MasterNilai.hasilkelulusan("Sri Handayani", 70);
        System.out.println("=========================================");
        
        //static fungsi
        System.out.println("\t\tHasil Nilai Kelulusan");
        System.out.println(MasterNilai.nilailulusan("Sri Handayani", 78, ""));
        System.out.println("=========================================");
    }
}

