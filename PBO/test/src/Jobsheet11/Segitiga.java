package Jobsheet11;

class Segitiga extends Bentuk{
    private float base;
    private float height;


    public Segitiga(float base, float height){
        this.base = base;
        this.height = height;
    }

    @Override
    float getArea(){
        return 0.5f * base * height;
    }
}
