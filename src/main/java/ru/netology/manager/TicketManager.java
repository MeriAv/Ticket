package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.Ticket;
import ru.netology.repository.TicketRepository;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TicketManager {
    private TicketRepository repository = new TicketRepository();

    public void add(Ticket item) {
        repository.save(item);
    }

    public Ticket[] searchAllByAirports(String from, String to) {
        Ticket[] result = repository.searchAirports(from, to);
        Arrays.sort(result);
        return result;
    }
}