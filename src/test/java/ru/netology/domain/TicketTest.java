package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {
    private Ticket first = new Ticket(1, 1300, "MSK", "SPB", 7530);
    private Ticket second = new Ticket(2, 1500, "MSK", "SPB", 7250);
    private Ticket third = new Ticket(3, 3100, "SMR", "KRD", 2300);
    private Ticket forth = new Ticket(4, 5200, "KRD", "SPB", 7840);
    private Ticket fifth = new Ticket(5, 1200, "SMR", "KRD", 1300);

    @Test
    public void shouldSortByPrice() {
        Ticket[] expected = new Ticket[]{fifth, third, second, forth, first};
        Ticket[] actual = new Ticket[]{first, second, third, forth, fifth};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }
}

