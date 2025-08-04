package com.example.learn.learn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("software-engineers")
public class SoftwareEngineerController {

    @GetMapping("all-engineers")
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Joan Liebert",
                        List.of("Mongo", "Express", "React", "Node")
                ),
                new SoftwareEngineer(
                        2,
                        "Sosuke Aizen",
                        List.of("Spiring Boot", "Spring Data JPA", "PostgreSQL", "Docker")
                )
        );
    }

}
