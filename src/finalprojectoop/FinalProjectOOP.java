/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectoop;
//class ditulis di sini
//konteks programnya umkm
//pelaku sistem: toko, pembeli, barang, pemilik
class Toko{

}
class Pembeli{

}
class Barang{
    //data/variable
    private String namabrg;
    int hargabrg;
    
    //method/fungsi
    void isibarang(String n, int h){
        namabrg=n;
        hargabrg=h;
    }
    void lihatBarang(){
        //tidak terlihat
        System.out.println("Nama Barang: "+namabrg);
        System.out.println("Harga: "+hargabrg);
    }
}
public class FinalProjectOOP {
    //deklarasi variable global
    //method tambahan
    static void header(){
        System.out.println("==========================");
        System.out.println("Warung Cahya");
        System.out.println("==========================");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //deklarasi variable lokal
        header();
        Barang brg = new Barang(); //cara membuat oop (create oject) artinya dialokasikan ke memori komputer
        brg.isibarang("Sabun", 3000);
        brg.lihatBarang();
        
        
    }
    
}
