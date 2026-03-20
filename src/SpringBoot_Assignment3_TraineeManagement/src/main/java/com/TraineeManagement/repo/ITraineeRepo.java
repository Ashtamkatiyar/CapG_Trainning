package com.TraineeManagement.repo;

import com.TraineeManagement.entity.Trainee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITraineeRepo extends JpaRepository<Trainee,Integer> {

    public List<Trainee> findByTraineeName(String name);
}
