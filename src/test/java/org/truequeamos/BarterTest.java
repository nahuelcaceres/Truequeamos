package org.truequeamos;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nahuel on 06/07/2017.
 */
public class BarterTest {

    @Test //(expected = Exception.class)
    public void testNoDeberiaCrearTruequeConImporteCero()
    {
        boolean assertResult;
        try {
            Barter barter = Barter.create(0);
            assertResult = true;

        }catch (RuntimeException runtimeExcection){
            assertResult = false;
        }

        assertFalse(assertResult);
    }

    @Test
    public void testPuedoCrearTruequeConValoresPositivos(){
        Barter barter= Barter.create(5);

        assertTrue(barter.getPrice()> 0);
    }

    @Test //(expected = Exception.class)
    public void testNoDeberiaCrearTruequeConImportesMenoresACero()
    {
        boolean assertResult;
        try {
            Barter barter =  Barter.create(-4);

            assertResult = true;

        }catch (RuntimeException runtimeExcection){
            assertResult = false;
        }

        assertFalse(assertResult);
    }

}
