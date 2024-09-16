package cibernacion.test.infrastructure.employee;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import cibernacion.test.domain.employee.EmployeeDocument;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeDocument, String> {

    Optional<EmployeeDocument> findById(String id);

    Optional<EmployeeDocument> findByName(String name);

    Optional<EmployeeDocument> findByIdCard(String idCard);
}
