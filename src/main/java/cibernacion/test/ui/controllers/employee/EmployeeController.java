package cibernacion.test.ui.controllers.employee;

import cibernacion.test.domain.employee.EmployeeEntity;
import cibernacion.test.domain.employee.usecase.EmployeeUseCases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeUseCases employeeUseCases;

    @PostMapping
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity employee) {
        return employeeUseCases.createEmployee(employee);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees() {
        return employeeUseCases.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<EmployeeEntity> getEmployeeById(@PathVariable String id) {
        return employeeUseCases.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeUseCases.deleteEmployee(id);
    }

    @PutMapping
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employee) {
        return employeeUseCases.updateEmployee(employee);
    }
}
