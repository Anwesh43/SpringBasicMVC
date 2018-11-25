package services;

import models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public void addPerson(Person person) {
        personRepository.addPerson(person);
    }

    public List<Person> getPersons() {
        return personRepository.getPersons();
    }


    public List<Person> getPersonsByAgeFilter(Predicate<Integer> agePredicate) {
        List<Person> persons = getPersons();
        if (persons == null || persons.size() == 0) {
            return null;
        }
        return persons.stream().filter(p -> agePredicate.test(p.getAge())).collect(Collectors.toList());
    }

    public List<Person> getPersonsByNameFilter(Predicate<String> namePredicate) {
        List<Person> persons = getPersons();
        if (persons == null || persons.size() == 0) {
            return null;
        }
        return persons.stream().filter(p -> namePredicate.test(p.getName())).collect(Collectors.toList());
    }

    public Person getPersonById(Integer id) {
        List<Person> persons = getPersons();
        if (persons == null || persons.size() == 0) {
            return null;
        }
        Map<Integer, List<Person>> personsIdMap = persons.stream().collect(Collectors.groupingBy(Person::getId));
        List<Person> personsWithId = personsIdMap.get(id);
        if (personsWithId == null || personsWithId.size() == 0) {
            return null;
        }
        return personsWithId.get(0);
    }
}
