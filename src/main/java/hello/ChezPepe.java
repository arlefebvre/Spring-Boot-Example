package hello;

import hello.domain.Pizza;
import hello.domain.CadeauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Arthur on 09/12/2015.
 */
@Component
public class ChezPepe implements CommandLineRunner {

    @Autowired
    private CadeauRepository pizzaRepository;

    @Override
    public void run(String... strings) throws Exception {
        pizzaRepository.save(new Pizza("Royale","Une pizza classique",12.00));
        pizzaRepository.save(new Pizza("Light","Pas d'ingrédients, juste de la pâte",3.00));
        pizzaRepository.save(new Pizza("Tartiflette","Une pizza bien riche",13.50));
    }
}
