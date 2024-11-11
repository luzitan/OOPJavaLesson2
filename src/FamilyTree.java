import java.util.ArrayList;
import java.util.List;

public class FamilyTree{
    private List<Person> people;


    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public List<Person> getChildren(Person parent) {
        return parent.getChildren();
    }

    public Person findPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public Person findPersonByFirstName(String FirstName) {
        for (Person person : people) {
            if (person.getName().equals(FirstName)) {
                return person;
            }
        }
        return null;
    }

    public Person findPersonByMiddleName(String MiddleName) {
        for (Person person : people) {
            if (person.getName().equals(MiddleName)) {
                return person;
            }
        }
        return null;
    }




}