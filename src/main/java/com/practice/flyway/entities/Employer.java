package com.practice.flyway.entities;

import jakarta.persistence.*;

import java.util.List;

import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;

@Table(name = "employer")
@Entity
@FlywayDataSource
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empID;
    private String username;
    private String password;
    private String org_email;
    private String org_name;

    @OneToMany(mappedBy = "employer")
    private List<Jobs> jobPostings;

    public Long getEmpID() {
        return empID;
    }

    public void setEmpID(Long empID) {
        this.empID = empID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrg_email() {
        return org_email;
    }

    public void setOrg_email(String org_email) {
        this.org_email = org_email;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public List<Jobs> getJobPostings() {
        return jobPostings;
    }

    public void setJobPostings(List<Jobs> jobPostings) {
        this.jobPostings = jobPostings;
    }
}
