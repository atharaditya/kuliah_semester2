package Jobsheet8;

public class Remote {
    private Televisi tv;

    public Remote (Televisi tv){
        this.tv = tv;
    }

    public void turnOnTV(){
        tv.turnOn();
    }

    public void turnOffTV(){
        tv.turnOff();
    }

    public void setVolume(int volume){
        tv.setVolume(volume);
    }

    public void setChannel(int channel){
        tv.setChannel(channel);
    }

    public static void main(String[] args) {
        Televisi tv = new Televisi();
        Remote remote = new Remote(tv);

        remote.turnOnTV();
        remote.setVolume(60);
        remote.setChannel(7);
        remote.turnOffTV();
    }
}