package my.sahira.testspringboot.controller;


import my.sahira.testspringboot.exception.ResourceNotFoundException;
import my.sahira.testspringboot.model.Population;
import my.sahira.testspringboot.repository.PopulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/population_state")
public class PopulationController {

    @Autowired
    private PopulationRepository populationRepository;

    @GetMapping
    public List<Population> getAllPopulations() {
        return populationRepository.findAll();
    }

    //build create population REST API
    @PostMapping
    public Population createPopulation(@RequestBody Population population) {
        return populationRepository.save(population);
    }

    //build get population by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Population> getEmployeeById(@PathVariable long id){
        Population population = populationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Population not exist with id:" +id));
                return ResponseEntity.ok(population);
    }

    //build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<Population> updatePopulation(@PathVariable long id,@RequestBody Population populationDetails){
        Population updatePopulation = populationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Population not exist with id:" +id));

        updatePopulation.setState(populationDetails.getState());
        updatePopulation.setDate(populationDetails.getDate());
        updatePopulation.setSex(populationDetails.getSex());
        updatePopulation.setAge(populationDetails.getAge());
        updatePopulation.setEthnicity(populationDetails.getEthnicity());
        updatePopulation.setPopulation(populationDetails.getPopulation());

        populationRepository.save(updatePopulation);
        return ResponseEntity.ok(updatePopulation);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deletePopulation(@PathVariable long id){
        Population population= populationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Population not exist with id:" +id));

        populationRepository.delete(population);
        return ResponseEntity.ok(HttpStatus.NO_CONTENT);
    }
}
