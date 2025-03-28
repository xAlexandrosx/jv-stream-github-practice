package practice;

import java.util.function.Predicate;
import model.Person;

public class CatOwnerValidator implements Predicate<Person> {
    private final int thresholdAge;

    public CatOwnerValidator(int thresholdAge) {
        this.thresholdAge = thresholdAge;
    }

    @Override
    public boolean test(Person person) {
        int age = person.getAge();
        Person.Sex sex = person.getSex();
        return age >= thresholdAge && sex == Person.Sex.WOMAN;
    }
}
