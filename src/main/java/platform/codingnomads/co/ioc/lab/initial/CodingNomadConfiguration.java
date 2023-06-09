package platform.codingnomads.co.ioc.lab.initial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import platform.codingnomads.co.ioc.lab.completed.OperatingSystem;
import platform.codingnomads.co.ioc.lab.completed.SoundSystem;

@Configuration
@ComponentScan("platform.codingnomads.co.ioc.lab.initial")
public class CodingNomadConfiguration {

    @Bean
    public Framework framework(){
        return Framework.builder().name("Spring Boot").version("2.5").build();
    }

    @Bean
    public IDE ide(){
        return IDE.builder().name("Intellij IDEA").version("2021.1").build();
    }

    @Bean
    public JDK jdk() {
        return JDK.builder().name("OpenJDK").version("11").build();
    }

    @Bean
    public Computer computer() {
        return Computer.builder().name("macOS").version("11.4").build();
    }

    @Bean
    public SoundSystem soundSystem() {
        return SoundSystem.builder().type("Speakers").brand("Bose").build();
    }
}
