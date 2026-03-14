package org.example;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements IEngine{
    @Override
    public String getBHP(){
        return "Desial 200 BHP";
    }
}
