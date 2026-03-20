package com.TraineeManagement.dto;

import com.TraineeManagement.entity.Trainee;

public class EntityMapper {
    public static TraineeDto convertEntityToDto(Trainee tr){
        return new TraineeDto(tr.getTraineeId(),tr.getTraineeName(),tr.getTraineeDomain(),tr.getTraineLocation());
    }
    public static Trainee convertDtoToEntity(TraineeDto tdto){
        return new Trainee(tdto.getTraineeDtoName(), tdto.getTraineeDtoDomain(), tdto.getTraineDtoLocation());
    }
}
