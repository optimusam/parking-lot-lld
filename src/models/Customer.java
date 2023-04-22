package models;

public class Customer {
    private Integer id;
    private Car car;
    private Ticket ticket;

    public Customer(Integer id, Car car) {
        this.id = id;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
