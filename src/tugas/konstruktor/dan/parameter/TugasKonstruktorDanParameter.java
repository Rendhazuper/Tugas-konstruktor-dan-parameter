/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.konstruktor.dan.parameter;

/**
 *
 * @author GAMES
 */
public class TugasKonstruktorDanParameter {

    int tinggi;
    String nama; 
    
    public TugasKonstruktorDanParameter(int tinggi, String nama){
       this.tinggi = tinggi;
       this.nama = nama;
       
    }
    public static void main(String[] args) {
        TugasKonstruktorDanParameter tugas = new TugasKonstruktorDanParameter(170, "Rendha Putra");
        TugasKonstruktorDanParameter tugas2 = new TugasKonstruktorDanParameter(165, "Vionastia");
        
        System.out.println(tugas.nama+ ", Tingginya : "+tugas.tinggi);
        System.out.println(tugas2.nama+ ", Tingginya : "+tugas2.tinggi);
    }
    
}
