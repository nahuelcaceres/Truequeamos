package org.truequeamos;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

/**
 * Created by nahuel on 06/07/2017.
 */
public class BarterTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void CannotCreateBarterWithZeroAmount() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("El importe no puede ser cero");

        Barter.create(0);
    }

    @Test
    public void CannotCreateBarterWithNegativeAmount() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("El importe no puede ser cero");

        Barter.create(-4);
    }

    @Test
    public void CanCreateBarterWithPositiveAmount() {
        Barter barter = Barter.create(5);

        assertTrue(barter.getPrice() == 5);
    }

    @Test
    public void test1(){
        int idItemFrom = 1;
        int idItemTo = 2;
        int idUserFrom = 1;
        int idUserTo = 2;

        Intercambio intercambio = Intercambio.create(idUserFrom, idItemFrom, idUserTo, idItemTo);

        Barter barter = Barter.create(intercambio);

        barter.concretar();

        assertTrue("No se realizo el intercambio correctamente",idItemFrom == intercambio.getIdItemTo()) ;
        assertTrue("No se realizo el intercambio correctamente",idItemTo == intercambio.getIdItemFrom());

    }
}
