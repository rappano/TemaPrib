/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesSoal;



/**
 *
 * @author predator
 */
public class Pembeli extends Toko{
    public String js1,js2,js3,js4,js5,js6;
    public int Pembeli;
    public int jumlahpembelian;
    
    @Override
    public void tampil(){
        System.out.println("Urea      50kg  "+js1);
        System.out.println("NPK       1kg   "+js2);
        System.out.println("Gramoxone 1L    "+js3);
        System.out.println("Curacron  100ml  "+js4);
        System.out.println("Matador   250ml  "+js5);
        System.out.println("Decis     500ml  "+js6);
    }
    
   //@Override
   public void kegunaan(){
        System.out.println("rekomendasi pupuk: "+super.kegunaan);
   }
   
   //overloading
   public int jumlahpembelian(int jumlahbarang){
       this.jumlahpembelian=jumlahbarang;
       return jumlahbarang;
       
   }
   public void total(double jumlahbarangmax){
       System.out.println("Total jumlah barang: "+jumlahbarangmax);
   }

    
    
}


