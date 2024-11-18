import java.io.IOException;
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

        // Создаем объект для работы с файлами
        FileOperations fileOps = new FileOperationsImpl();

        // Сохраняем генеалогическое древо в файл
        try {
            fileOps.saveToFile(familyTree, "familyTree.dat");
            System.out.println("Family tree saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Загружаем генеалогическое древо из файла
        FamilyTree loadedFamilyTree = null;
        try {
            loadedFamilyTree =
                    fileOps.loadFromFile("familyTree.dat");
            System.out.println("Family tree loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Проверяем, что древо загрузилось правильно
        if (loadedFamilyTree != null) {
            for (Person person : loadedFamilyTree.getPeople()) {
                System.out.println("Loaded person: " +
                        person.getName() + ", born in " + person.getDateBirth());
            }
        }



//        // Пример получения всех детей sidor
//        List<Person> sidorChildren = familyTree.getChildren(sidor);
//        for (Person child : sidorChildren) {
//            System.out.println("Дети Сидора: " + child.getName());
//
//
//        }
//
//        List<Person> annaChildren = familyTree.getChildren(anna);
//        for (Person child : annaChildren) {
//            System.out.println("Дети Анны: " + child.getName());
//
//
//        }


//        System.out.println(ivan);
//        System.out.println(sidor);
//        sidor.setDateBirth(24,5,1968);
//        System.out.println(sidor);

    }
}
