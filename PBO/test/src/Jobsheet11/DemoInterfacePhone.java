package Jobsheet11;

class InterfacePhone {
    public static void main(String[] args) {
        ITelephone timsPhone = new DeskPhone(12323232);
        timsPhone.powerOn();
        timsPhone.callPhone(12323232);
        timsPhone.answer();

    }
}