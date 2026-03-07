package com.cg.Basic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product p=new Product("Iphone17",125000,5, LocalDate.of(2025,11,16));
        Product p4=new Product("Iphone17",125000,5, LocalDate.of(2025,11,16));

        Product p5=new Product("Iphone17",125000,5, LocalDate.of(2025,11,16));

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em= emf.createEntityManager();

//        ---------Inserting Data into Database by creating table

        EntityTransaction tx= em.getTransaction();
        tx.begin();
        em.persist(p);
        em.persist(p4);
        em.persist(p5);
        tx.commit();
        System.out.println("product created..............");

        // ------Searching Data------------

//        Product p1=em.find(Product.class,101);
//        if (p1 !=null){
//            System.out.println(p1);
//        }
//        else System.out.println("Not found ");

        //      -------For selecting All -----------

//        List<Product> li=em.createQuery("from Product").getResultList();
//        li.forEach(n-> System.out.println(n));

        // ------Deleting Data------------

//        em.getTransaction().begin();
//        Product p2=em.find(Product.class,101);
//        if (p2 !=null){
//            em.remove(p2);
//            System.out.println(p2);
//        }
//        else System.out.println("Not found ");
//        em.getTransaction().commit();



    }
}
