package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Flight;

import static org.junit.jupiter.api.Assertions.*;

class FlightManagerTest {
    private FlightManager manager = new FlightManager();
    private Flight first = new Flight(1, 1000, "DOM", "ANT", 750);
    private Flight second = new Flight(2, 500, "DOM", "ANT", 750);
    private Flight third = new Flight(3, 300, "SVO", "LIS", 300);
    private Flight forth = new Flight(4, 500, "IST", "LAX", 780);
    private Flight fifth = new Flight(5, 100, "SVO", "LIS", 300);

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
    }

    @Test
    void shouldSearchAndSortByAirports() {
        String from = "DOM";
        String to = "ANT";
        Flight[] expected = new Flight[]{second, first};
        Flight[] actual = manager.findAllByAirports(from, to);
        assertArrayEquals(expected, actual);
    }
}
