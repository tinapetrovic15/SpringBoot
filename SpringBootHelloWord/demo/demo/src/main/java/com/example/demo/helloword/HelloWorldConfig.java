package com.example.demo.helloword;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class HelloWorldConfig {
    @Bean
    CommandLineRunner commandLineRunner(HelloWorldRepository repository) {
        return args -> {
            repository.saveAll(List.of(
                    new HelloWorld("Sprski", "Zdravo svete!",	"srp"),
                    new HelloWorld("Engleski", "Hello world!","eng"),
                    new HelloWorld("Spanski", "Hola Mundo!","spa"),
                    new HelloWorld("Italijanski", "Ciao mondo!","ita"),
                    new HelloWorld("Francuski", "Bonjour le monde!","fra"),
                    new HelloWorld("Nemacki", "Hallo Welt!","gem"),
                    new HelloWorld("Ruski", "Привет, мир!","rus"),
                    new HelloWorld("Japanski", "こんにちは世界!","jpn"),
                    new HelloWorld("Kineski", "你好世界!","zho"),
                    new HelloWorld("Grcki", "Γειά σου Κόσμε!","ell")
            ));
        };
    }
}
