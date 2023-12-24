package Config;

import Beancreation.A;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public A getA(){
        return new A();
    }

}
