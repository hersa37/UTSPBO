/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.utspbo;
import java.io.Serializable;
/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Dealer implements Serializable{
    public static final int MAX_CAR=50;
    private String location;
    private String code;
    private Car[] storage;
    private int amountInStore;
    
    public Dealer(String code){
        this.code=code;
    }
    
    public Dealer(String code, Car[] storage, int amountInStore) {
        this.code = code;
        this.storage = storage;
        this.amountInStore=amountInStore;
        
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public int getAmountInStore() {
        return amountInStore;
    }   
    
    public Car[] getStorage() {
        return storage;
    }    

    public void setStorage(Car[] storage, int amountInStore) {
        this.storage = storage;
        this.amountInStore=amountInStore;
    }
    
    public void addCar(Car car){
        if(amountInStore<MAX_CAR){
            storage[amountInStore]=car;
            amountInStore++;
        } else System.out.println("STORAGE FULL");
    }
    
    public void removeCar(int index){
        storage[index]=storage[amountInStore-1];
        storage[amountInStore-1]=null;
        amountInStore--;
    }
    
    public void removeCar(String id){
        for(int i=0;i<amountInStore;i++){
            if(storage[i].getId().equals(id)){
                storage[i]=storage[amountInStore-1];
                storage[amountInStore-1]=null;
                amountInStore--;
            }
        }
    }
    
    public Car getCarAt(int index){
        return storage[index];
    }
    
    public Car[] findModel(String model){
        int length=0;
        Car[] tempModels=new Car[MAX_CAR];
        
        for(int i=0;i<amountInStore;i++){
            if(storage[i].getModelName().equals(model)){
                tempModels[length]=storage[i];
                length++;
            }
        }        
        Car[] models=new Car[length];
        System.arraycopy(tempModels, 0, models, 0, length);
        return models;
    }
    
    public Car findCarID(String id){
        for(int i=0;i<amountInStore;i++){
            if(storage[i].getId().equals(id)){
                return storage[i];
            }
        }        
        return new Car();
    }
    
    public Car[] getOutgoing(){
        int length=0;        
        Car[] tempOutgoing=new Car[MAX_CAR];
        
        for(int i=0;i<amountInStore;i++){
            if(storage[i].isSaleStatus()==true){
                tempOutgoing[length]=storage[i];
                length++;
            }
        }
        Car[] outgoing=new Car[length];
        System.arraycopy(tempOutgoing, 0, outgoing, 0, length);        
        return outgoing;
    }
    
    public Car[] getUnsold(){
        int length=0;
        Car[] tempUnsold=new Car[MAX_CAR];
        
        for(int i=0;i<amountInStore;i++){
            if(storage[i].isSaleStatus()==false){
                tempUnsold[length]=storage[i];
                length++;
            }
        }        
        Car[] unsold=new Car[length];
        System.arraycopy(tempUnsold, 0, unsold, 0, length);
        return unsold;
    }
    
    @Override
    public String toString(){
        String print="[";
        print+="Dealer: "+code+"; Location: "+location+"; Stock: "+amountInStore;
        print+="\nCar List:";
        for(int i=0;i<amountInStore;i++){
            print+="\n"+storage[i].toString();
        }
        print+="]";
        return print;
    }
}
