package org.truequeamos;

/**
 * Created by mchacon on 11/07/17.
 */
public class TradeOff {

    private int idUserFrom;
    private int idItemFrom;
    private int idUserTo;
    private int idItemTo;

    public static TradeOff create(int idUserFrom, int idItemFrom, int idUserTo, int idItemTo){

        if (idUserFrom < 0 || idUserTo < 0) {
            throw new RuntimeException("Invalid user ids");
        }

        if (idUserFrom == idUserTo){
            throw new RuntimeException("Cannot create a TradeOff beetween the same two users");
        }

        return new TradeOff(idUserFrom, idItemFrom,  idUserTo, idItemTo);
    }

    private TradeOff(int idUserFrom, int idItemFrom, int idUserTo, int idItemTo){

        this.idItemFrom = idItemFrom;
        this.idUserFrom = idUserFrom;
        this.idItemTo = idItemTo;
        this.idUserTo = idUserTo;

    }

    public void concretar(){

        int idItemFrom = this.idItemFrom;
        int idItemto = this.idItemTo;

        this.idItemFrom = idItemto;
        this.idItemTo = idItemFrom;

    }

    public int getIdItemFrom(){
        return this.idItemFrom;
    }

    public int getIdItemTo(){
        return this.idItemTo;
    }

    public int getIdUserFrom(){
        return this.idUserFrom;
    }

    public int getIdUserTo(){
        return this.idUserTo;
    }

}
