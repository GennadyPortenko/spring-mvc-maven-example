package gpk.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean("MyBean")
    public String myBean() {
        return "My Bean";
    }
}
