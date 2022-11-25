package com.example.demo.helloword;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HelloWorldService {
    private final HelloWorldRepository helloWorldRepository;

    @Autowired
    public HelloWorldService(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }
    public List<HelloWorld> getAll() { return helloWorldRepository.findAll(); }

    public String getHelloWorldByLanguage(String language) {
       Optional<HelloWorld> helloWorldOptional = helloWorldRepository.findHelloWorldByShortcut(language);
       if(helloWorldOptional.isPresent()) {
           return helloWorldOptional.get().getTranslation();
       }
       return "U bazi ne postoji uneta skracenica za jezik :(";

    }
}
