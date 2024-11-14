package Jobsheet11;

public class Lingkaran extends Bentuk {
    private float radius;

    public Lingkaran(float radius){
        this.radius = radius;
    }
    @Override
    float getArea(){
        return (float) (Math.PI * radius * radius);
    }
    
}
