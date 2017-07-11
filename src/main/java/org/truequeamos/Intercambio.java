package org.truequeamos;

/**
 * Created by mchacon on 11/07/17.
 */
public class Intercambio {

    private int idUserFrom;
    private int idItemFrom;
    private int idUserTo;
    private int idItemTo;

    public static Intercambio create(int idUserFrom, int idItemFrom, int idUserTo, int idItemTo){

        return new Intercambio(idUserFrom, idItemFrom,  idUserTo, idItemTo);

    }

    private Intercambio(int idUserFrom, int idItemFrom, int idUserTo, int idItemTo){

        this.idItemFrom = idItemFrom;
        this.idUserFrom = idUserFrom;
        this.idItemTo = idItemTo;
        this.idUserTo = idUserTo;

    }

    public int getIdItemFrom(){
        return this.idItemFrom;
    }

    public int getIdItemTo(){
        return this.idItemTo;
    }


}
