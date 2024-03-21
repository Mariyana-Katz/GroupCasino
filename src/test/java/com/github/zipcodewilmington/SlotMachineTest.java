package com.github.zipcodewilmington;
import com.github.zipcodewilmington.casino.games.slots.SlotMachine;
import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
public class SlotMachineTest {
    @Test
    public void testCalculatePayoutJackpot() {
        int[] result = {1, 1, 1};
        assertEquals(100, SlotMachine.calculatePayout(result));
    }
    @Test
    public void testCalculatePayoutMatchTwoSymbols() {
        int[] result = {1, 1, 2};
        assertEquals(10, SlotMachine.calculatePayout(result));
    }
    @Test
    public void testCalculatePayoutNoMatch() {
        int[] result = {1, 2, 3};
        assertEquals(0, SlotMachine.calculatePayout(result));
    }
    @Test
    public void testSpinReels() {
        Random random = new Random();
        int[] result = SlotMachine.spinReels(random);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertTrue(result[0] >= 1 && result[0] <= 5);
        assertTrue(result[1] >= 1 && result[1] <= 5);
        assertTrue(result[2] >= 1 && result[2] <= 5);
    }
}