package ru.kovorot.main.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.kovorot.main.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
