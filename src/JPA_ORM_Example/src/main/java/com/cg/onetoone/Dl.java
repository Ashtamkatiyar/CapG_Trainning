package com.cg.onetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class Dl {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dlno;
    private LocalDate expdate;
    private LocalDate issueDate;
    private String type;


    public Dl(){}
    public Dl( LocalDate expdate, LocalDate issueDate, String type) {
        this.expdate = expdate;
        this.issueDate = issueDate;
        this.type = type;
    }

    public int getDlno() {
        return dlno;
    }

    public void setDlno(int dlno) {
        this.dlno = dlno;
    }

    public LocalDate getExpdate() {
        return expdate;
    }

    public void setExpdate(LocalDate expdate) {
        this.expdate = expdate;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dl{" +
                "dlno=" + dlno +
                ", expdate=" + expdate +
                ", issueDate=" + issueDate +
                ", type='" + type + '\'' +
                '}';
    }
}
