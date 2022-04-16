/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.utspbo;

import java.util.Arrays;
import pbo1.utspbo.write;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Main {
    public static void main(String[] args) {
        int dealerAmount=4;
        Dealer[] dealer=new Dealer[dealerAmount];
        
        System.out.println("\t\t>>Dealer H37<<");
        
        dealer[0]=new Dealer("H37");
        Car[] h37Cars=new Car[Dealer.MAX_CAR];
        dealer[0].setStorage(h37Cars, 0);
        dealer[0].addCar(new Car("Atanza", "2.4L Turbo Diesel", 130000000, "blue"));
        dealer[0].addCar(new Car("Rosh", "3.0L I4", 121423300, "red"));
        dealer[0].addCar(new Car("Atanza","1.2 Ecoboost",142899999,"red"));
        dealer[0].addCar(new Car("Reamur","2.9L V6",300540000,"blue/green"));
        h37Cars[0].setSaleStatus(true);
        
        System.out.println("--Dealer H37 attributes--");
        System.out.println(dealer[0]);
        
        h37Cars[2].setSaleStatus(true);
        
        System.out.println("\nFind cars with model name Atanza:");
        System.out.println(Arrays.toString(dealer[0].findModel("Atanza")));
        
        System.out.println("\nSold cars in storage:");
        System.out.println(Arrays.toString(dealer[0].getOutgoing()));
        
        System.out.println("\nUnsold cars in storage:");
        System.out.println(Arrays.toString(dealer[0].getUnsold()));
        
        System.out.println("\n--Dealer H37 end attributes--");
        System.out.println(dealer[0]);
        //==================================================================================
        System.out.println("\n\n");
        System.out.println("\t\t>>Dealer BH73GP<<");
        
        Car[] bh73gp=new Car[Dealer.MAX_CAR];
        bh73gp[0]=new Car("Zonda","5.0L V12",69420000,"black");
        bh73gp[0].setId("D1442");
        bh73gp[1]=new Car("Teriaki","2.0L Diesel",99000000,"pink");
        bh73gp[2]=new Car("Rosh", "3.0L I4", 121423300, "blue");
        bh73gp[2].setId("B1120");
        bh73gp[3]=new Car("Rosh", "3.0L I4", 121423300, "white");
        
        dealer[1]=new Dealer("BH73GP",bh73gp,4);
        dealer[1].setLocation("Surabaya");
        
        System.out.println("--Dealer BH73GP attributes--");
        System.out.println(dealer[1]);
        dealer[1].removeCar(1);
        
        System.out.println("\nFind car with ID D1442");
        System.out.println(dealer[1].findCarID("D1442"));
        
        System.out.println("\nFind car with model Rosh");
        System.out.println(Arrays.toString(dealer[1].findModel("Rosh")));
        System.out.println("\n");
        System.out.println(dealer[1]);
        
        write w=new write();
        w.writer();
        
        read r=new read();
        r.read();
    }    
}
