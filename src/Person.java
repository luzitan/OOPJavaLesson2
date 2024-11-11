import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String firstName;
    private String middleName;
    private String dateBirth;

    private Person mother;
    private Person father;
    private List<Person> children;

    public Person(String firstName, String name, String middleName, String dateBirth) {
        this.name = name;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateBirth = dateBirth;
        this.children = new ArrayList<>();
    }
    public Person(String firstName, String name, String middleName, int year) {
        this.name = name;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateBirth = "01.01." + year;
        this.children = new ArrayList<>();
    }

    public String getNameFull() {
        return String.format("%s %s %s", this.firstName, this.name, this.middleName);
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setDateBirth(int day, int month, int year) {
        dateBirth = day + "." + month + "." + year;
    }

    public String getDateBirth() {
//        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        String dateBirthFormat = dateBirth.format(format);
        return dateBirth;
    }
    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void addChild(Person child) {
        this.children.add(child);
    }

    public List<Person> getChildren() {
        return children;

    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, %sг", this.firstName, this.name, this.middleName, this.dateBirth);
    }
}