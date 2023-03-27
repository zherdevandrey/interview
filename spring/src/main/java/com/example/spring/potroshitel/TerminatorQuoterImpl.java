package com.example.spring.potroshitel;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TerminatorQuoterImpl implements TerminatorQuoter {

    @InjectRandomInt(min = 0, max = 10)
    private int number;

    @Override
    public void say() {
        for (int i = 0; i < number; i++) {
            System.out.println("bla bla");
        }
    }
}
