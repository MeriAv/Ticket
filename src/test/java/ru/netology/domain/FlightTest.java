package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {
    private Flight first = new Flight(1, 1000, "DOM", "ANT", 750);
    private Flight second = new Flight(2, 500, "DOM", "ANT", 750);
    private Flight third = new Flight(3, 300, "SVO", "LIS", 300);
    private Flight forth = new Flight(4, 500, "IST", "LAX", 780);
    private Flight fifth = new Flight(5, 100, "SVO", "LIS", 300);

    @Test
    public void shouldSortByPrice() {
        Flight[] expected = new Flight[]{fifth, third, second, forth, first};
        Flight[] actual = new Flight[]{first, second, third, forth, fifth};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}

