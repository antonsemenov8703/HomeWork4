package controller;

import java.util.Random;

public class Names {
    private Random rnd = new Random();

    public String getName() {
        return nameSwitcher(rnd.nextInt(6));
    }

    private String nameSwitcher(int nextInt) {
        switch (nextInt) {
            case 0:
                return "Peter";
            case 1:
                return "Misha";
            case 2:
                return "Ivan";
            case 3:
                return "Kirill";
            case 4:
                return "Pavel";
            case 5:
                return "Roma";
            default:
                return "Stas";
        }
    }


}
