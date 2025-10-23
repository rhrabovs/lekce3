import java.math.BigDecimal;
import java.time.LocalDate;

public class Person {
    public static final int DEFAULT_TEMPERATURE = -300;
    private static int nextId = 1; // tridni atribut static
    private int id = nextId++;
    private String name;
    private String surname;
    private BigDecimal account;
    private boolean isEmployee;
    private int tickets = 0;
    private LocalDate lastArrival;
    private double bodyTemperature;

    // konstruktor


    public Person(String name, String surname, BigDecimal account, boolean isEmployee, LocalDate lastArrival, double bodyTemperature) {
        this.name = name;
        this.surname = surname;
        this.account = account;
        this.isEmployee = isEmployee;
        this.lastArrival = lastArrival;
        this.bodyTemperature = bodyTemperature;
    }

    public Person(String name, String surname, LocalDate lastArrival) {
        this(name,surname,BigDecimal.ZERO,true,lastArrival, DEFAULT_TEMPERATURE);
    }

    public int getId() {
        return id;
    }

    /**
    public void setId(int id) {
        this.id = id;
    }
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public boolean isEmployee() {
        return isEmployee;
    }

    public void setEmployee(boolean employee) {
        isEmployee = employee;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public LocalDate getLastArrival() {
        return lastArrival;
    }

    public void setLastArrival(LocalDate lastArrival) {
        this.lastArrival = lastArrival;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    @Override
    public String toString() {
        if (isEmployee()) {
            return  name + ' ' + surname + " (ID: " + id +")";
        } else {
            return "Navsteva " + name + ' ' + surname;
        }
    }
}
