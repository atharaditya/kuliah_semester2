package Jobsheet8;

public class Televisi {
    private boolean isOn;
    private int volume;
    private int channel;

    public Televisi(){
        isOn = false;
        volume = 0;
        channel = 1;
    }

    public void turnOn(){
        isOn = true;
        System.out.println("Televisi dihidupkan");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("Televisi dimatikan");
    }

    public void setVolume(int volume) {
        if (isOn) {
            if (volume >= 0 && volume <= 100) {
                this.volume = volume;
                System.out.println("Volume diatur ke: " + volume);
            } else {
                System.out.println("Volume harus berada di antara 0 dan 100");
            }
        } else {
            System.out.println("Televisi belum dihidupkan");
        }
    }

     public void setChannel(int channel) {
        if (isOn) {
            if (channel >= 1 && channel <= 10) {
                this.channel = channel;
                System.out.println("Channel diatur ke: " + channel);
            } else {
                System.out.println("Channel harus berada di antara 1 dan 10");
            }
        } else {
            System.out.println("Televisi belum dihidupkan");
        }
    }

    public static void main(String[] args) {
        Televisi tv = new Televisi();

        tv.turnOn();
        tv.setVolume(66);
        tv.setChannel(10);
        tv.turnOff();
    }
}