package configs;

import models.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {
    @Bean
    public Person me() {
        return Person.newInstance("Anwesh", 26,1);
    }
}
