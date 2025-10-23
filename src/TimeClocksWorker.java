import java.util.ArrayList;
import java.util.List;

public class TimeClocksWorker {
    private List<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
    }

    public void addPersons(List<Person> persons){
        personList.addAll(persons);
    }

    public int getPersonCount(){
        return personList.size();
    }

    public double getAverageTickets(){
        if (personList.isEmpty()){
            return 0.0;
        }

        int totalTickets = 0;

        for (Person person:personList){
            totalTickets += person.getTickets();
        }
        return (double) totalTickets/personList.size();
    }

    public List<Person> getEployees(){
        List<Person> employees = new ArrayList<>();
        for (Person person : personList){
            if (person.isEmployee()) {
                employees.add(person);
            }
        }
        return employees;
    }
}
