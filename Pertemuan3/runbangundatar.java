/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author X1
 */
public class runbangundatar {
    public static void main(String[] args) {
        masterbangundatar R = new masterbangundatar();
        System.out.println("Hasil Method Prosedur dengan Parameter");
        R.hitungluasjajargenjang(5, 3);
        
        System.out.println("\nHasil Method Fungsi dengan Parameter");
        System.out.println("Luas jajargenjang "+R.luasjajargenjang(10, 6));
        
        System.out.println("\nHasil Method Static Prosedur");
        masterbangundatar.menghitungluasjajargenjang(15, 10);
        
        System.out.println("\nHasil Method Static Fungsi");
        System.out.println("Luas jajargenjang "+ masterbangundatar.perhitunganluasjajargenjang(20, 16));
    }
}
