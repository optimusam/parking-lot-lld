package models;

public class Ticket {
    private final Integer id;

    public Ticket(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        return id.equals(ticket.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public Integer getId() {
        return id;
    }
}
