package com.TraineeManagement.service;

import com.TraineeManagement.dto.EntityMapper;
import com.TraineeManagement.dto.TraineeDto;
import com.TraineeManagement.entity.Trainee;
import com.TraineeManagement.repo.ITraineeRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TraineeService implements ItraineeService{

    private ITraineeRepo trepo;

    public TraineeService(ITraineeRepo trepo) {
        this.trepo = trepo;
    }

    @Override
    public List<TraineeDto> getAllTrainee() {
        List<Trainee> li=trepo.findAll();
        List<TraineeDto> lidto=new ArrayList<>();
        for(Trainee t :li){
            lidto.add(EntityMapper.convertEntityToDto(t));
        }
        return lidto;
    }

    @Override
    public List<TraineeDto> getTraineeByName(String name) {
       List<Trainee> trs=trepo.findByTraineeName(name);
       List<TraineeDto> tdtos=new ArrayList<>();
       for(Trainee tr:trs){
           tdtos.add(EntityMapper.convertEntityToDto(tr));
       }
       return tdtos;
    }

    @Override
    public TraineeDto getTraineeById(int id) {
        Trainee tr=trepo.findById(id).orElse(null);
        if(tr!=null){
           return EntityMapper.convertEntityToDto(tr);
        }
        return null;
    }

    @Override
    public String removeTraineeById(int id) {
        Trainee tr=trepo.findById(id).orElse(null);
        if(tr!=null){
            trepo.deleteById(id);
            return "Trainee Deleted";
        }
        return "Trainee Not Found";
    }

    @Override
    public TraineeDto updateTraineeInfo(TraineeDto tdto) {
      Trainee existing=trepo.findById(tdto.getTraineeDtoId()).orElse(null);
      if(existing!=null){

         if(tdto.getTraineeDtoName()!=null){
         existing.setTraineeName(tdto.getTraineeDtoName());}

          if(tdto.getTraineeDtoDomain()!=null){
         existing.setTraineeDomain(tdto.getTraineeDtoDomain());}

          if(tdto.getTraineDtoLocation()!=null){
              existing.setTraineLocation(tdto.getTraineDtoLocation());}

          Trainee updated = trepo.save(existing);
          System.out.println("updated");
          return EntityMapper.convertEntityToDto(updated);
      }
      else return null;

    }

    @Override
    public TraineeDto createTrainee(TraineeDto tdto) {
       Trainee tr=EntityMapper.convertDtoToEntity(tdto);
       Trainee saved=trepo.saveAndFlush(tr);
       return EntityMapper.convertEntityToDto(saved);

    }
}
