package com.challenge.api.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Instant;

public class CreateEmployeeRequest {

    @NotBlank(message = "First name may not be blank")
    private String firstName;

    @NotBlank(message = "Last name may not be blank")
    private String lastName;

    @NotNull(message = "Salary may not be blank") @Min(value = 0, message = "Salary must be greater than 0")
    private Integer salary;

    @NotNull(message = "Age may not be blank") @Min(value = 0, message = "Age must be greater than 0")
    private Integer age;

    @NotBlank(message = "Job title may not be blank")
    private String jobTitle;

    @NotBlank(message = "Email may not be blank")
    private String email;

    @NotNull(message = "Contract hire date may not be blank") private Instant contractHireDate;

    private Instant contractTerminationDate;

    public CreateEmployeeRequest(
            String firstName,
            String lastName,
            Integer salary,
            Integer age,
            String jobTitle,
            String email,
            Instant contractHireDate,
            Instant contractTerminationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
        this.jobTitle = jobTitle;
        this.email = email;
        this.contractHireDate = contractHireDate;
        this.contractTerminationDate = contractTerminationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContractHireDate(Instant date) {
        this.contractHireDate = date;
    }

    public Instant getContractHireDate() {
        return contractHireDate;
    }

    public void setContractTerminationDate(Instant date) {
        this.contractTerminationDate = date;
    }

    public Instant getContractTerminationDate() {
        return contractTerminationDate;
    }
}
