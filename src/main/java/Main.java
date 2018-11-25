import configs.PersonConfiguration;
import configs.PersonsServiceConfiguration;
import configs.ShapeConfiguration;
import models.Person;
import models.ProfileGetter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.PersonRepository;
import services.PersonService;

public class Main {
    public static void main(String args[]) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //ctx.register(PersonConfiguration.class, ShapeConfiguration.class, ProfileGetter.class);
        ctx.register(PersonsServiceConfiguration.class);
        ctx.refresh();
//        ProfileGetter profileGetter = (ProfileGetter) ctx.getBean("profileGetter");
//        if (profileGetter != null) {
//            profileGetter.displayPersonDetails();
//            profileGetter.displayShapeDetails();
//        }
        PersonService personService = (PersonService) ctx.getBean("personService");
        personService.addPerson(Person.newInstance("p1", 24, 1));
        personService.addPerson(Person.newInstance("p2", 25, 2));
        personService.addPerson(Person.newInstance("p3", 17, 3));
        personService.addPerson(Person.newInstance("a1", 19, 4));
        personService.addPerson(Person.newInstance("a2", 12, 5));
        personService.addPerson(Person.newInstance("a3", 26, 6));
        Thread.sleep(1000);
        System.out.println("printing all persons =================");
        personService.getPersons().forEach(System.out::println);
        Thread.sleep(2000);
        System.out.println("======printing person with id 3");
        System.out.println(personService.getPersonById(3));
        Thread.sleep(2000);
        System.out.println("person who are less than 20=======");
        personService.getPersonsByAgeFilter((age) -> age < 20).forEach(System.out::println);
        Thread.sleep(2000);
        System.out.println("person whose name begins with a======");
        personService.getPersonsByNameFilter((name) -> name.startsWith("a")).forEach(System.out::println);
        Thread.sleep(2000);
        System.out.println("person whose name end with 1 =======");
        personService.getPersonsByNameFilter((name) -> name.endsWith("1")).forEach(System.out::println);
        Thread.sleep(2000);
        System.out.println("Closing Program");
    }
}

