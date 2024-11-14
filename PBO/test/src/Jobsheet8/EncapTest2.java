package Jobsheet8;

public class EncapTest2 {
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        EncapTest2 s = new EncapTest2();
        s.setName("vijay");
        System.out.println(s.getName());
        }
}