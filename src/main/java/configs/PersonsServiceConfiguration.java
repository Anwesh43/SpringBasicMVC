package configs;

import models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import services.PersonService;

@Configuration
@ComponentScan("repositories")
public class PersonsServiceConfiguration {
    @Bean
    PersonService personService() {
        return new PersonService();
    }
}
