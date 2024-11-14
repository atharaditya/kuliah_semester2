package Jobsheet11;

abstract class Bentuk { 
    String color; 

    void setColor(String color){ 
        this.color = color; 
    } 
    String getColor(){ 
        return this.color; 
    } 
    
    abstract float getArea(); 
}