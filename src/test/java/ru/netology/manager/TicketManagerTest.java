package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

import static org.junit.jupiter.api.Assertions.*;

class TicketManagerTest {


    @Test
    void shouldSearchAndSortByAirports() {
        TicketManager manager = new TicketManager();
        Ticket first = new Ticket(1, 1000, "MSK", "SPB", 750);
        Ticket second = new Ticket(2, 500, "MSK", "SPB", 750);
        manager.add(first);
        manager.add(second);
        String from = "MSK";
        String to = "SPB";
        Ticket[] expected = new Ticket[]{second, first};
        Ticket[] actual = manager.searchAllByAirports(from, to);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchAndSortByAirports1Ticket() {
        TicketManager manager = new TicketManager();
        Ticket first = new Ticket(1, 1000, "MSK", "SPB", 750);
        manager.add(first);
        String from = "MSK";
        String to = "SPB";
        Ticket[] expected = new Ticket[]{first};
        Ticket[] actual = manager.searchAllByAirports(from, to);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchAndSortByAirportsNoTicket() {
        TicketManager manager = new TicketManager();
        String from = "MSK";
        String to = "SPB";
        Ticket[] expected = new Ticket[]{};
        Ticket[] actual = manager.searchAllByAirports(from, to);
        assertArrayEquals(expected, actual);
    }
}
