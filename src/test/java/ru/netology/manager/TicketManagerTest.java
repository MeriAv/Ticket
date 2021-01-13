package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    private TicketManager manager = new TicketManager();
    private Ticket first = new Ticket(1, 1000, "MSK", "SPB", 750);
    private Ticket second = new Ticket(2, 500, "MSK", "SPB", 750);
    private Ticket third = new Ticket(3, 300, "SMR", "KRD", 300);
    private Ticket forth = new Ticket(4, 500, "KRD", "SPB", 780);
    private Ticket fifth = new Ticket(5, 100, "SMR", "KRD", 300);

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
        String from = "MSK";
        String to = "SPB";
        Ticket[] expected = new Ticket[]{second, first};
        Ticket[] actual = manager.searchAllByAirports(from, to);
        assertArrayEquals(expected, actual);
    }
}
