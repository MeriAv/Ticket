package ru.netology.repository;

import ru.netology.domain.Ticket;

public class TicketRepository {

    private Ticket[] items = new Ticket[0];

    public void save(Ticket item) {
        int length = items.length + 1;
        Ticket[] tmp = new Ticket[length];
        if (items.length != 0) {
            System.arraycopy(items, 0, tmp, 0, items.length);
        }
        tmp[length - 1] = item;
        items = tmp;
    }

    public Ticket[] search() {
        return items;
    }

    public Ticket[] searchAirports(String from, String to) {
        Ticket[] result = new Ticket[0];
        for ( Ticket item : items) {
            if ((item.getFromWhich().equalsIgnoreCase(from)) && (item.getWhere().equalsIgnoreCase(to))) {
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = item;
                result = tmp;
            }
        }
        return result;
    }

    public void removeById(int id) {
        int index = 0;
        for ( Ticket item : items) {
            if (item.getId() == id) {
                int length = items.length - 1;
                Ticket[] tmp = new Ticket[length];
                for ( Ticket item2 : items) {
                    if (item2.getId() != id) {
                        tmp[index] = item2;
                        index++;
                    }
                }
                items = tmp;
                return;
            }
        }
    }
}

