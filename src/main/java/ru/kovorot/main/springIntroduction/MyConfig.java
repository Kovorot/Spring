package ru.kovorot.main.springIntroduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("ru.kovorot.main.springIntroduction")
@PropertySource("classpath:application.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
