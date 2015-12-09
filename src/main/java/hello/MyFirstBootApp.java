package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 * Created by Arthur on 08/12/2015.
 */
@SpringBootApplication
//@EnableGlobalMethodSecurity(securedEnabled = true)
public class MyFirstBootApp {

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
