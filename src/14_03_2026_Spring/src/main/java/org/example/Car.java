package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("car")
//@Repository
//@Service
public class Car {

    @Value("${carname}") // Spring Expression language
    private String name;

    @Autowired
    @Qualifier("diesel")
    private IEngine engine;

    @Autowired
    @Qualifier("JKTyre")
    private ITyre tyre;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public ITyre getTyre() {
        return tyre;
    }

    public void setTyre(ITyre tyre) {
        this.tyre = tyre;
    }

    public Car() {
    }

    public Car(IEngine engine, ITyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    public void printCar(){
        System.out.println("Name : "+name);
        System.out.println("Engine : "+engine.getBHP());
        System.out.println("Tyre : " +tyre.getTyreDetails());
    }
}
