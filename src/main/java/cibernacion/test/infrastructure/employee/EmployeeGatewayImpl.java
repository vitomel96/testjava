package cibernacion.test.infrastructure.employee;

import cibernacion.test.domain.employee.EmployeeEntity;
import cibernacion.test.domain.employee.gateway.EmployeeGateway;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeGatewayImpl implements EmployeeGateway {

    @Override
    public EmployeeEntity save(EmployeeEntity employee) {
        return null;
    }

    @Override
    public List<EmployeeEntity> findAll() {
        return null;
    }

    @Override
    public Optional<EmployeeEntity> findById(String id) {
        return null;
    }

    @Override
    public Optional<EmployeeEntity> findByName(String name) {
        return null;
    }

    @Override
    public Optional<EmployeeEntity> findByIdCard(String idCard) {
        return null;
    }

    @Override
    public void deleteById(String id) {
    }
}
