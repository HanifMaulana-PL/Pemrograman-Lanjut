/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester_2_pemlan;

/**
 *
 * @author Hanif Maulana
 */
public class App{
    public static void main(String[] args) {
        lingkaran Lingkaran = new lingkaran("Lingkaran", 5);
        Lingkaran.info();
        Lingkaran.luas();
        System.out.println("");
        
        bujurSangkar BS = new bujurSangkar("Bujur Sangkar", 5);
        BS.info();
        BS.luas();
    }
    
}