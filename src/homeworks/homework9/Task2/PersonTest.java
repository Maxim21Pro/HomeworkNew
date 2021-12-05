package homeworks.homework9.Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonTest {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alex", "Volchkovich", 30));
        people.add(new Person("Sveta", "Petrova", 25));
        people.add(new Person("Romanppppppppppp", "Hilman", 31));
        people.add(new Person("Inna", "Markova", 28));
        people.add(new Person("Ivan", "Kozlov", 20));

        Person older = people.stream()
                .filter(person -> person.getFirstName().length() < 15)
                .max(Comparator.comparing(Person::getAge)).get();
        System.out.println(older);


    }
}
