package configs;

import models.ProfileGetter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileGetterConfiguration {
    @Bean
    public ProfileGetter profileGetter() {
        return ProfileGetter.getInstance();
    }
}
