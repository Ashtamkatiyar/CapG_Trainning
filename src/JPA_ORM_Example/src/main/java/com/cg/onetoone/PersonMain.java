package com.cg.onetoone;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();
        Person p=new Person("Ankit", LocalDate.of(2001,10,12));
        Person p1=new Person("Saurabh", LocalDate.of(2002,10,12));
        Dl obj=new Dl(LocalDate.of(2032,10,12),LocalDate.of(2012,10,12),"LMV,HMV");
        p1.setDl(obj);
        //em.persist(obj);
        em.persist(p1);
        em.getTransaction().commit();
        System.out.println("Person created............. ");

        //-------finding one person
//
//        Person p=em.find(Person.class,52);
//        if(p!=null){
//            System.out.println(p);
//        }
//        else System.out.println("Noty Found ");
//
//        //------Finding All persons -------
//
//        List<Person> li=em.createQuery("from Person").getResultList();
//        li.forEach(n-> System.out.println(n));
//
//        //-----Updating details
//
        em.getTransaction().begin();
        Person p3=em.find(Person.class,2);
        if(p3!=null){
           p3.getDl().setType("LMV");
            System.out.println(p3);
        }
        else System.out.println("Not Found ");
        em.getTransaction().commit();
    }
}
