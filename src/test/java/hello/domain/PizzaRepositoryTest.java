package hello.domain;

import hello.MyFirstBootApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Arthur on 09/12/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyFirstBootApp.class)
public class PizzaRepositoryTest {

    @Autowired
    private PizzaRepository pizzaRepository;

    /*
    @org.junit.Before
    public void pereNoel(){
        pizzaRepository.save(new Pizza("Orange"));
        pizzaRepository.save(new Pizza("TV"));
        pizzaRepository.save(new Pizza("PS4"));
    }
    */

    @Test
    public void findByNomTest(){
        Pizza c = pizzaRepository.findByNom("Royale");
        assertNotNull(c);
    }
}
