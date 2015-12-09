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
    private CadeauRepository cadeauRepository;

    /*
    @org.junit.Before
    public void pereNoel(){
        cadeauRepository.save(new Pizza("Orange"));
        cadeauRepository.save(new Pizza("TV"));
        cadeauRepository.save(new Pizza("PS4"));
    }
    */

    @Test
    public void findByNomTest(){
        Pizza c = cadeauRepository.findByNom("Royale");
        assertNotNull(c);
    }
}
