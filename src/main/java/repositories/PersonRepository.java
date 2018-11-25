package repositories;

import models.Person;
import org.springframework.stereotype.Repository;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class PersonRepository {

    private List<Person> persons = new ArrayList<Person>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getPersons() {
        return persons;
    }
 }
