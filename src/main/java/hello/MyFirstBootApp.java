package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import java.util.Random;

/**
 * Created by Arthur on 08/12/2015.
 */
@SpringBootApplication
//@EnableGlobalMethodSecurity(securedEnabled = true)
public class MyFirstBootApp {

    @Bean
    public HealthIndicator indicateurPasFiable() {
        return () ->  {
            if(new Random().nextBoolean())
                return Health.up().build();
            else
                return Health.down().withDetail("Etat pizza","Cramée").build();
        };
    }


    @Configuration
    static class SecurityConfig extends GlobalAuthenticationConfigurerAdapter {
        @Override
        public void init(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication().withUser("user").password("user").roles("USER","CHEF")
            .and()
            .withUser("chef").password("chef").roles("CHEF");
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(MyFirstBootApp.class);
    }
}
