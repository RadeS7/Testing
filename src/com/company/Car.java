package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel (String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }else {
            this.model = "Unknown";
        }
    }

    public void setEngine (String engine) {
        this.engine = engine;
}
    public String getModel (){
        return this.model;
    }
    public String getEngine (){
        return this.engine;
    }
}
