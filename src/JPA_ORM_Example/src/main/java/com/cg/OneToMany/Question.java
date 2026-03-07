package com.cg.OneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int qid;
    private String questionname;
    private String level;

    @OneToMany( mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answer;

    public String getQuestionname() {
        return questionname;
    }

    public void setQuestionname(String questionname) {
        this.questionname = questionname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public Question(){}

    public Question(String questionname, String level) {
        this.questionname = questionname;
        this.level = level;
       // this.answer = answer;
    }
}
