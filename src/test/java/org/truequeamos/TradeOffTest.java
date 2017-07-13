package org.truequeamos;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

/**
 * Created by nahuel on 06/07/2017.
 */
public class TradeOffTest {

    @Rule
    public final ExpectedException expectedException = ExpectedException.none();

    @Test
    public void CannotCreateTradeOffWithUserIdsNegatives() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Invalid user ids");

        TradeOff.create(-1,1,-2,2);
    }

    @Test
    public void CannotCreateTradeOffBeetweenTheSameTwoUsers() {

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Cannot create a TradeOff beetween the same two users");

        TradeOff.create(1,2,1,3);

    }

}
