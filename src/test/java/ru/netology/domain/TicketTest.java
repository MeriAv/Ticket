package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    private Ticket first = new Ticket(1, 1000, "MSK", "SPB", 750);
    private Ticket second = new Ticket(2, 500, "MSK", "SPB", 750);
    private Ticket third = new Ticket(3, 300, "SMR", "KRD", 300);
    private Ticket forth = new Ticket(4, 500, "KRD", "SPB", 780);
    private Ticket fifth = new Ticket(5, 100, "SMR", "KRD", 300);

    @Test
    public void shouldSortByPrice() {
        Ticket[] expected = new Ticket[]{fifth, third, second, forth, first};
        Ticket[] actual = new Ticket[]{first, second, third, forth, fifth};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}

