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
public class write implements Serializable {
    public void writer(){
        try{
            FileOutputStream f=new FileOutputStream(new File("output.txt"));
            ObjectOutputStream o=new ObjectOutputStream(f);
            o.writeObject(new Dealer("B33"));
            
            o.close();
            f.close();
        } catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch(IOException e){
            System.out.println("Error initializing stream");
        }
    }
}
