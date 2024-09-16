package cibernacion.test.domain.employee.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import cibernacion.test.domain.employee.EmployeeEntity;
import cibernacion.test.domain.employee.gateway.EmployeeGateway;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeUseCases {

    @Autowired
    private EmployeeGateway employeeGateway;

    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeGateway.save(employee);
    }

    public List<EmployeeEntity> getAllEmployees() {
        return employeeGateway.findAll();
    }

    public Optional<EmployeeEntity> getEmployeeById(String id) {
        return employeeGateway.findById(id);
    }

    public void deleteEmployee(String id) {
        employeeGateway.deleteById(id);
    }

    public EmployeeEntity updateEmployee(EmployeeEntity employee) {
        return employeeGateway.save(employee);
    }
}
