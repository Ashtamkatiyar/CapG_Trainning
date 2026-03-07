package com.cg.OneToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class QuestionMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em= emf.createEntityManager();
//        em.getTransaction().begin();
//        Question q=new Question("What is java","M");
//        List<Answer> li=new ArrayList<>();
//        li.add(new Answer("Java is simple",q));
//        li.add(new Answer("Java is secure",q));
//        li.add(new Answer("Java is safe",q));
//        q.setAnswer(li);
//        em.persist(q);
//        em.getTransaction().commit();
//        System.out.println("Created.............");

//        Question q=em.find(Question.class,1);
//        System.out.println(q.getQuestionname());
//        q.getAnswer().forEach(a-> System.out.println(a));

//        Answer ans=em.find(Answer.class,2);
//        System.out.println("=========Answer==========");
//        System.out.println(ans.getAns());
//        System.out.println("=========Question=============");
//        System.out.println(ans.getQuestionid().getQuestionname());

        em.getTransaction().begin();
        Question qus=em.find(Question.class,1);
        em.remove(qus);
        em.getTransaction().commit();


    }
}
