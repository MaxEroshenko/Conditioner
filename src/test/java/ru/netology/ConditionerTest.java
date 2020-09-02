package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void temperatureInReducedRange() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(30);
        conditioner.decreaseCurrentTemperature();
        assertEquals(29, conditioner.getCurrentTemperature());
    }

    @Test
    public void extendedRangeTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(22);
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
    }

    @Test
    public void lowestTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(35);
        conditioner.decreaseCurrentTemperature();
        assertEquals(34, conditioner.getCurrentTemperature());
    }

    @Test
    public void theHighestTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(10);
        conditioner.increaseCurrentTemperature();
        assertEquals(11, conditioner.getCurrentTemperature());
    }

    @Test
    public void temperatureAboveMaximum() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(55);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void temperatureBelowMinimum() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(-15);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void maximumSetTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(35, conditioner.getCurrentTemperature());
    }
    @Test
    public void minimumSetTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setMaxTemperature(35);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10, conditioner.getCurrentTemperature());
    }
}
