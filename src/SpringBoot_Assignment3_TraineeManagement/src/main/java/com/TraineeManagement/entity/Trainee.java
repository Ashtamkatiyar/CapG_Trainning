package com.TraineeManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int traineeId;
    private String traineeName;
    private String traineeDomain;
    private String traineLocation;



    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public String getTraineeDomain() {
        return traineeDomain;
    }

    public void setTraineeDomain(String traineeDomain) {
        this.traineeDomain = traineeDomain;
    }

    public String getTraineLocation() {
        return traineLocation;
    }

    public void setTraineLocation(String traineLocation) {
        this.traineLocation = traineLocation;
    }

    public int getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    public Trainee(String traineeName, String traineeDomain, String traineLocation) {
        this.traineeName = traineeName;
        this.traineeDomain = traineeDomain;
        this.traineLocation = traineLocation;
    }

    public Trainee() {
    }
}
