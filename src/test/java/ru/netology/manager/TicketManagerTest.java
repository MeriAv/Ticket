package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {
    private TicketManager manager = new TicketManager();
    private Ticket first = new Ticket(1, 1300, "MSK", "SPB", 7530);
    private Ticket second = new Ticket(2, 1500, "MSK", "SPB", 7250);
    private Ticket third = new Ticket(3, 3100, "SMR", "KRD", 2300);
    private Ticket forth = new Ticket(4, 5200, "KRD", "SPB", 7840);
    private Ticket fifth = new Ticket(5, 1200, "SMR", "KRD", 1300);

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
        Ticket[] expected = new Ticket[]{second, first};
        Ticket[] actual = manager.searchAllByAirports(from, to);
        assertArrayEquals(expected, actual);
    }
}
