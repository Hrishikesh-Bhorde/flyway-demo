package com.practice.flyway.controller;

import com.practice.flyway.entities.Employer;
import com.practice.flyway.service.EmployerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployerController {

    private final EmployerService service;

    EmployerController(EmployerService service)
    {
        this.service = service;
    }

    @GetMapping("/getAll")
    ResponseEntity<List<Employer>> getAll()
    {
        return ResponseEntity.ok(service.getAllEmployers());
    }

    @GetMapping("/get/{id}")
    ResponseEntity<Employer> getByID(@PathVariable Long id)
    {
        return ResponseEntity.ok(service.getEmployerByID(id));
    }

    @PostMapping("/create")
    ResponseEntity<Employer> register(@RequestBody Employer emp)
    {
        return ResponseEntity.ok(service.addEmployer(emp));
    }

}
