package org.example;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine{
    public String getBHP(){
        return " petrol 150 BHP";
    }

}
