/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.utspbo;

import java.io.*;
/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class read {
    public void read(){
        try{
            FileInputStream f=new FileInputStream(new File("output.txt"));
            ObjectInputStream o=new ObjectInputStream(f);
            
            Dealer d=(Dealer) o.readObject();
            System.out.println(d.toString());
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Error initializing stream");
        } catch(ClassNotFoundException e){
            System.out.println("Class not found");
        }
    }
}
