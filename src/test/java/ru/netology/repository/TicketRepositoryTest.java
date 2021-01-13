package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryTest {
    private TicketRepository repository = new TicketRepository();
    private Ticket first = new Ticket(1, 1000, "MSK", "SPB", 750);
    private Ticket second = new Ticket(2, 500, "MSK", "SPB", 750);
    private Ticket third = new Ticket(3, 300, "SMR", "KRD", 300);
    private Ticket forth = new Ticket(4, 500, "KRD", "SPB", 780);
    private Ticket fifth = new Ticket(5, 100, "SMR", "KRD", 300);

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(forth);
        repository.save(fifth);
    }

    @Test
    void shouldSearchByAirports() {
        String from = "SMR";
        String to = "KRD";
        Ticket[] expected = new Ticket[]{third, fifth};
        Ticket[] actual = repository.searchAirports(from, to);
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldRemoveByIdIfExist() {
        int idToRemove = 4;
        repository.removeById(idToRemove);
        Ticket[] expected = new Ticket[]{first, second, third, fifth};
        Ticket[] actual = repository.search();
        assertArrayEquals(expected, actual);
    }
    @Test
    void shouldRemoveByIdIfNotExist() {
        int idToRemove = 6;
        repository.removeById(idToRemove);
        Ticket[] expected = new Ticket[]{first, second, third, forth, fifth};
        Ticket[] actual = repository.search();
        assertArrayEquals(expected, actual);
    }
}
