package com.TraineeManagement.service;

import com.TraineeManagement.dto.TraineeDto;
import com.TraineeManagement.entity.Trainee;

import java.util.List;

public interface ItraineeService {
    public List<TraineeDto> getAllTrainee();

    public List<TraineeDto> getTraineeByName(String name);

    public TraineeDto getTraineeById(int id);

    public String removeTraineeById(int id);

    public TraineeDto updateTraineeInfo(TraineeDto tdto);

    public TraineeDto createTrainee(TraineeDto tdto);
}
