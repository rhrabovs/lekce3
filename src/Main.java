import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // evidence zamestnancu

        List<Person> personList = new ArrayList<>();
        personList.add(
                new Person("Jan","Novak", BigDecimal.valueOf(1000), true, LocalDate.now(), 36.5));

        personList.get(0).setTickets(40);

        for (int i=0; i<20;i++){
            personList.add(new Person(""+i,"guest",BigDecimal.valueOf(300),false, LocalDate.now(),Person.DEFAULT_TEMPERATURE));
        }

        System.out.println("Pocet osob je "+personList.size());
        personList.forEach(System.out::println);

        TimeClocksWorker worker = new TimeClocksWorker();
        worker.addPersons(personList);
        System.out.println("Prumerny pocet ticketu: "+worker.getAverageTickets());

        List<Person> employees = worker.getEployees();
        System.out.println("Pocet zamestnancu: "+employees.size());

        // jenom test git-u
    }
}