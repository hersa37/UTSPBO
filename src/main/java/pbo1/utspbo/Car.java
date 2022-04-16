/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo1.utspbo;

import java.text.DecimalFormat;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Car {
        private String modelName;
        private int price;
        private String engine;
        private boolean saleStatus;        
        private String color;
        private String id;
    
    public Car(){
        this("","",0,"");
    }
    
    public Car(String modelName){
        this.modelName=modelName;
    }
    public Car(String modelName, String engine, int price, String color) {
        this.modelName = modelName;
        this.engine = engine;
        this.price = price;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(boolean saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
        @Override
    public String toString(){
        return "{Model: "+modelName+"; Price: "
                +new DecimalFormat("###,###,###,###,###").format(price)
                +"; Sold: "+saleStatus+"}";
    }           
}
