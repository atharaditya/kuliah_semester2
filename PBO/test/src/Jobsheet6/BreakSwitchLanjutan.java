package Jobsheet6;

public class BreakSwitchLanjutan {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 1: System.out.println("1");
                    i++;
                    switch (i) {
                        case 1: System.out.println("1");
                        case 2: System.out.println("2");
                                break;
                        case 3: System.out.println("3");
                    }
            case 2: System.out.println("2");
            case 3: System.out.println("3");
        }
    }
}