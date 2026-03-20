package com.TraineeManagement.controller;

import com.TraineeManagement.dto.TraineeDto;
import com.TraineeManagement.service.TraineeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainee")
public class TraineeController {

    public TraineeController(TraineeService service) {
        this.service = service;
    }

    private TraineeService service;

    @GetMapping
    public List<TraineeDto> getAlllTrainee(){
        return service.getAllTrainee();
    }

    @GetMapping("/{id}")
    public TraineeDto getTraineeByIdd(@PathVariable int id){
        return service.getTraineeById(id);
    }

    @DeleteMapping("/{id}")
    public String removeTraineeByIdd(@PathVariable int id){
        return service.removeTraineeById(id);
    }

    @GetMapping("/name/{name}")
    public List<TraineeDto> getTraineeByName(@PathVariable String name){
        return service.getTraineeByName(name);
    }

    @PutMapping
    public TraineeDto updateTraineeInfo(@RequestBody TraineeDto tdto){
        return service.updateTraineeInfo(tdto);
    }

    @PostMapping
    public TraineeDto createTraineee(@RequestBody TraineeDto tdto){
        return service.createTrainee(tdto);
    }


}
