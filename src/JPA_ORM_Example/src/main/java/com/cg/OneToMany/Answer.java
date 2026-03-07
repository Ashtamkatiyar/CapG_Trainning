package com.cg.OneToMany;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int aid;
    private String ans;
    @ManyToOne()
    @JoinColumn(name = "Question_id")
    private Question question;


    public Question getQuestionid() {
        return question;
    }

    public void setQuestionid(Question question) {
        this.question = question;
    }


    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Answer(){}
    public Answer(String ans,Question question) {
        this.ans = ans;
        this.question=question;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "aid=" + aid +
                ", ans='" + ans + '\'' +
                '}';
    }

}
