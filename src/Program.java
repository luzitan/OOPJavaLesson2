import java.util.List;

public class Program {

    public static void main(String[] args) {
//    int age;
        FamilyTree familyTree = new FamilyTree();

        // Создаем людей
        Person ivan = new Person("Иванов", "Иван", "Сидорович", "12.11.1995");
        Person petr = new Person("Иванов", "Петр", "Сидорович", 1992);
        Person anna = new Person("Иванова", "Анна", "Владимировна", 1970);
        Person sidor = new Person("Иванов", "Сидор", "Алексеевич", 1968);
//    System.out.println(person);
//    System.out.println(person1);
//    System.out.println(person.getDateBirth());

        // Устанавливаем родительские связи
        // ivan
        ivan.setMother(anna);
        ivan.setFather(sidor);
        anna.addChild(ivan);
        sidor.addChild(ivan);

        // petr
        petr.setMother(anna);
        petr.setFather(sidor);
        anna.addChild(petr);
        sidor.addChild(petr);

        // Добавляем людей в древо
        familyTree.addPerson(ivan);
        familyTree.addPerson(petr);
        familyTree.addPerson(anna);
        familyTree.addPerson(sidor);

        // Пример получения всех детей sidor
        List<Person> sidorChildren = familyTree.getChildren(sidor);
        for (Person child : sidorChildren) {
            System.out.println("Дети Сидора: " + child.getName());


        }

        List<Person> annaChildren = familyTree.getChildren(anna);
        for (Person child : annaChildren) {
            System.out.println("Дети Анны: " + child.getName());


        }


        System.out.println(ivan);
        System.out.println(sidor);
        sidor.setDateBirth(24,5,1968);
        System.out.println(sidor);

    }
}
