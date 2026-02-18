/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester_2_pemlan;

/**
 *
 * @author Hanif Maulana
 */
class bujurSangkar extends bidangDuaDimensi {
    protected int sisi;
    public bujurSangkar(String nama, int sisi){
        super(nama);
        this.sisi = sisi;
    }
    public void infobujurSangkar(){
        info();
        System.out.println("Jumlah Sisi : " + sisi);
    }
    @Override
    public void luas(){//overriding
        System.out.println("Luas : "+sisi*sisi);
    }
    
}
