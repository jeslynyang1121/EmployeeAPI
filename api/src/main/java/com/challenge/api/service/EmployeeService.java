package com.challenge.api.service;

import com.challenge.api.model.CreateEmployeeRequest;
import com.challenge.api.model.Employee;
import com.challenge.api.model.EmployeeDTO;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private Map<UUID, Employee> employees = new ConcurrentHashMap<>();

    public EmployeeService() {
        setup();
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    public Optional<Employee> getEmployeeByUuid(UUID uuid) {
        return Optional.ofNullable(employees.get(uuid));
    }

    public Employee createEmployee(CreateEmployeeRequest request) {
        UUID uuid = UUID.randomUUID();
        EmployeeDTO employee = new EmployeeDTO(
                uuid,
                request.getFirstName(),
                request.getLastName(),
                request.getSalary(),
                request.getAge(),
                request.getJobTitle(),
                request.getEmail(),
                request.getContractHireDate(),
                null);
        employees.put(uuid, employee);
        return employee;
    }

    private void setup() {
        EmployeeDTO employee1 = new EmployeeDTO(
                UUID.randomUUID(),
                "John",
                "Doe",
                80000,
                20,
                "Software Engineer Intern",
                "john.doe@example.com",
                Instant.now(),
                null);
        EmployeeDTO employee2 = new EmployeeDTO(
                UUID.randomUUID(),
                "Jane",
                "Smith",
                100000,
                30,
                "Software Engineer",
                "jane.smith@example.com",
                Instant.now(),
                null);
        EmployeeDTO employee3 = new EmployeeDTO(
                UUID.randomUUID(),
                "Jeslyn",
                "Yang",
                90000,
                22,
                "Associate Software Engineer",
                "jeslynyang1121@gmail.com",
                Instant.now(),
                null);
        employees.put(employee1.getUuid(), employee1);
        employees.put(employee2.getUuid(), employee2);
        employees.put(employee3.getUuid(), employee3);
    }
}
