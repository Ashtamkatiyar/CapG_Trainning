package com.TraineeManagement.dto;

public class TraineeDto {
    private int traineeDtoId;
    private String traineeDtoName;
    private String traineeDtoDomain;
    private String traineDtoLocation;

    public int getTraineeDtoId() {
        return traineeDtoId;
    }

    public void setTraineeDtoId(int traineeDtoId) {
        this.traineeDtoId = traineeDtoId;
    }

    public String getTraineeDtoName() {
        return traineeDtoName;
    }

    public void setTraineeDtoName(String traineeDtoName) {
        this.traineeDtoName = traineeDtoName;
    }

    public String getTraineeDtoDomain() {
        return traineeDtoDomain;
    }

    public void setTraineeDtoDomain(String traineeDtoDomain) {
        this.traineeDtoDomain = traineeDtoDomain;
    }

    public String getTraineDtoLocation() {
        return traineDtoLocation;
    }

    public void setTraineDtoLocation(String traineDtoLocation) {
        this.traineDtoLocation = traineDtoLocation;
    }

    public TraineeDto(int traineeDtoId, String traineeDtoName, String traineeDtoDomain, String traineDtoLocation) {
        this.traineeDtoId = traineeDtoId;
        this.traineeDtoName = traineeDtoName;
        this.traineeDtoDomain = traineeDtoDomain;
        this.traineDtoLocation = traineDtoLocation;
    }

    public TraineeDto() {
    }

    public TraineeDto(String traineeDtoName, String traineeDtoDomain, String traineDtoLocation) {
        this.traineeDtoName = traineeDtoName;
        this.traineeDtoDomain = traineeDtoDomain;
        this.traineDtoLocation = traineDtoLocation;
    }
}
