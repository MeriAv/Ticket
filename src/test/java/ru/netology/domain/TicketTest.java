package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.TicketManager;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {


    @Test
    public void shouldSortByPriceAll() {
        TicketManager manager = new TicketManager();
         Ticket first = new Ticket(1, 1000, "MSK", "SPB", 750);
       Ticket second = new Ticket(2, 500, "MSK", "SPB", 750);
        Ticket third = new Ticket(3, 300, "SMR", "KRD", 300);
         Ticket forth = new Ticket(4, 500, "KRD", "SPB", 780);
         Ticket fifth = new Ticket(5, 100, "SMR", "KRD", 300);
        Ticket[] expected = new Ticket[]{fifth, third, second, forth, first};
        Ticket[] actual = new Ticket[]{first, second, third, forth, fifth};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortByPrice1() {
        TicketManager manager = new TicketManager();
        Ticket first = new Ticket(1, 1000, "MSK", "SPB", 750);
        Ticket[] expected = new Ticket[]{first};
        Ticket[] actual = new Ticket[]{first};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSortByPriceNull() {
        TicketManager manager = new TicketManager();
        Ticket[] expected = new Ticket[]{};
        Ticket[] actual = new Ticket[]{};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}

