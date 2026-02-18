/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semester_2_pemlan;

/**
 *
 * @author Hanif Maulana
 */
class lingkaran extends bidangDuaDimensi {
    protected int radius;
    public lingkaran(String nama, int radius){
        super(nama);
        this.radius = radius;
    }
    @Override
    public void luas(){
        System.out.println("Luas : "+3.14*radius*radius);
    }
    public void infolingkaran(){
        info();
        System.out.println("Jumlah Radius : " + radius);
    }
    
}
