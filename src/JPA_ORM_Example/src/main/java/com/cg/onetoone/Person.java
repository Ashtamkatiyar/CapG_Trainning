package com.cg.onetoone;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int poid;
    private String name;
    private LocalDate dob;
    @OneToOne(cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    @JoinColumn(name = "Person_dl")
    private Dl dl;

    public int getPoid() {
        return poid;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dl getDl() {
        return dl;
    }

    public void setDl(Dl dl) {
        this.dl = dl;
    }

    public Person(){}

    public Person(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
       // this.dl = dl;
    }


    @Override
    public String toString() {
        return "Person{" +
                "poid=" + poid +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", dl=" + dl +
                '}';
    }
}
