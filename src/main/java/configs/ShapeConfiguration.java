package configs;

import models.Shape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShapeConfiguration {
    @Bean
    public Shape redSquare() {
        return Shape.newInstance("Square","red");
    }
}
