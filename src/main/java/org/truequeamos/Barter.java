package org.truequeamos;

/**
 * Created by nahuel on 06/07/2017.
 */
public class Barter {

    private int price;
    private TradeOff tradeOff;

    public static Barter create(int price) {
        if (price <= 0) {
            throw new RuntimeException("El importe no puede ser cero");
        }

        return new Barter(price);
    }

    public static Barter create(TradeOff tradeOff){
        if (tradeOff == null){
            throw new RuntimeException("El objeto tradeOff es requerido");
        }

        return new Barter(tradeOff);
    }


    private Barter(int price) {
        this.price = price;
    }

    private Barter(TradeOff tradeOff){
        this.tradeOff = tradeOff;
    }


    public void concretar(){

        this.tradeOff.concretar();

    }

    public int getPrice() {
        return this.price;
    }

    public TradeOff getTradeOff(){
        return this.tradeOff;
    }
}
