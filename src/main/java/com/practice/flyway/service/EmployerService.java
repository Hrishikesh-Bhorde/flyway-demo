package com.practice.flyway.service;

import com.practice.flyway.entities.Employer;
import com.practice.flyway.repository.EmployerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployerService {
    private final EmployerRepository repo;

    public EmployerService(EmployerRepository repo)
    {
        this.repo = repo;
    }

    public Employer addEmployer(Employer emp)
    {
        Employer e = new Employer();
        e.setOrg_email(emp.getOrg_email());
        e.setUsername(emp.getUsername());
        e.setPassword(emp.getPassword());
        e.setOrg_name(emp.getOrg_name());

        Employer saved = repo.saveAndFlush(e);
        return saved;
    }

    public Employer getEmployerByID(Long id) throws RuntimeException
    {
        Optional<Employer> e = repo.findById(id);
        if (e.isPresent())
            return  e.get();
        else
            throw  new RuntimeException("Employer not found");
    }

    public List<Employer> getAllEmployers()
    {
        return  repo.findAll();
    }
}

