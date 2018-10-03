/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkir;

/**
 *
 * @author root
 */
public class Parkir {
   Integer perulangan;
   String tempat[] = {"Motor", "Mobil", "Bus"};
   void pesan(){
       System.out.println("Lot Parkir Yang di Perbolehkan :");
   }
}

class Motor extends Parkir {
    void area(){
        pesan();
        for(perulangan=0;perulangan<3;perulangan++){
            System.out.println("- Area Parkir "+tempat[perulangan]);
        }
    }
}

class Mobil extends Parkir {
    void area(){
        pesan();
        for(perulangan=1;perulangan<3;perulangan++){
            System.out.println("- Area Parkir "+tempat[perulangan]);
        }
    }
}

class Bus extends Parkir {
    void area(){
        pesan();
        for(perulangan=2;perulangan<3;perulangan++){
            System.out.println("- Area Parkir "+tempat[perulangan]);
        }
    }
}