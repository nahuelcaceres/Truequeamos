package org.truequeamos;

/**
 * Created by nahuel on 06/07/2017.
 */
public class Barter {

    private int price;

    public Barter(int price) {
        if (price<=0){
            throw new RuntimeException("El importe no puede ser cero");
        }

        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
