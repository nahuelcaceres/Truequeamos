package org.truequeamos;

/**
 * Created by nahuel on 06/07/2017.
 */
public class Barter {

    private int price;

    public static Barter create(int price){
        if (price<=0){
            throw new RuntimeException("El importe no puede ser cero");
        }

        Barter barter = new Barter(price);
        return barter;
    }

    private Barter(int price) {
        if (price<=0){
            throw new RuntimeException("El importe no puede ser cero");
        }

        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
