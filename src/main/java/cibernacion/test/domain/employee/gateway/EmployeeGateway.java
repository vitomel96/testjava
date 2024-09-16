package cibernacion.test.domain.employee.gateway;

import cibernacion.test.domain.employee.EmployeeEntity;
import java.util.List;
import java.util.Optional;

public interface EmployeeGateway {
    EmployeeEntity save(EmployeeEntity employee);
    List<EmployeeEntity> findAll();
    Optional<EmployeeEntity> findById(String id);
    Optional<EmployeeEntity> findByName(String name);
    Optional<EmployeeEntity> findByIdCard(String idCard);
    void deleteById(String id);
}
