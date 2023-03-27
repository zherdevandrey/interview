package com.example.spring;

import com.example.spring.potroshitel.TerminatorQuoter;
import com.example.spring.scope.PrototypeBean;
import com.example.spring.scope.SingletonBean;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {

    private final PrototypeBean prototypeBean;
    private final SingletonBean singletonBean;
    private final TerminatorQuoter terminatorQuoter;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        terminatorQuoter.say();
    }
}
