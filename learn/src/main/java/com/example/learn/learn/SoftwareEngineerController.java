package com.example.learn.learn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class SoftwareEngineerController {

    @Autowired
    private SoftwareEngineerService softwareEngineerService;

    @GetMapping("/getAllSoftwareEngineer")
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getAllSoftwareEngineer();
    };

    @PostMapping("/addEngineer")
    public void addEngineer(@RequestBody SoftwareEngineer softwareEngineer){
        softwareEngineerService.AddSoftwareEngineer(softwareEngineer);
    };

    @GetMapping("/{id}")
    public SoftwareEngineer getOneEngineer(@PathVariable Integer id){
        return softwareEngineerService.getSoftwareEngineer(id);
    };

    @PutMapping("/{id}")
    public void updateEngineer(@PathVariable Integer id, @RequestBody SoftwareEngineer softwareEngineer){
        softwareEngineerService.updateSoftwareEngineer(id, softwareEngineer);
    };

    @DeleteMapping("/{id}")
    public void deleteEngineer(@PathVariable Integer id){
        softwareEngineerService.deleteSoftwareEngineer(id);
    };
}
