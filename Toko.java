/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesSoal;

import java.util.Scanner;

/**
 *
 * @author predator
 */
public class Toko {
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        Pembeli p = new Pembeli();
 
        System.out.println("-------------------------------");
        System.out.println(" Toko Pertanian Anugerah Tani ");
        System.out.println("-------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String Nama = nm.nextLine();
        System.out.println( Nama+ " Silahkan ");
        System.out.println("");
        
        System.out.println("Jumlah barang yang ingin di beli: ");  
        String jumlah =nm.nextLine();
        System.out.println("");
        
        
        p.kegunaan();
        
        p.js1="(Rp 250.000)";
        p.js2="(Rp 20.000)";
        p.js3="(Rp 35.000)";
        p.js4="(Rp 35.000)";
        p.js5="(Rp 65.000)";
        p.js6="(Rp 145.000)";
        p.tampil();
        p.total(6);
        
        
        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println(" Terimakasih silahkan datang kembali ");
        System.out.println("-------------------------------------");
        
    }
    
    String kegunaan="Untuk melindungi tanaman dari hama dan membuat tanaman subur";
    
    public void tampil(){
        
    }
    public void pembeli(){
        
    }
        }

