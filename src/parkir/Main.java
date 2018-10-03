/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;
import java.util.Scanner;
/**
 *
 * @author root
 */
public class Main {
     public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        String jenis_kdr = "";
        Motor motorr = new Motor();
        Mobil mobill = new Mobil();
        Bus buss = new Bus();
        
        System.out.print("Jenis Kendaraan : ");
        jenis_kdr = inputan.next();
        
        switch(jenis_kdr.toLowerCase()){
            case "motor":
                motorr.area();
                break;
            case "mobil":
                mobill.area();
                break;
            case "bus":
                buss.area();
                break;
            default:
                System.out.println("Kendaraan Tidak ada");
                break;
        }
    }
}
