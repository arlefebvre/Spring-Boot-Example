package hello;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;


/**
 * Created by Arthur on 08/12/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyFirstBootApp.class)
@WebIntegrationTest(randomPort = true)
public class MyFirstBootAppTest {

    @Value("${local.server.port}")
    private String port;

    @Test
    public void integrationTest(){
        String url = "http://localhost:"+port+"/";
        String body = new RestTemplate().getForObject(url,String.class);
        assertEquals(body, "Bonjour la communauté");
    }
}
