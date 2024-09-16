package cibernacion.test.domain.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibernacion.test.infrastructure.employee.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeEntity save(EmployeeEntity employee) {
        EmployeeDocument doc = convertToDocument(employee);
        EmployeeDocument savedDoc = employeeRepository.save(doc);
        return convertToEntity(savedDoc);
    }

    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll().stream()
            .map(this::convertToEntity)
            .toList();
    }

    public Optional<EmployeeEntity> findById(String id) {
        return employeeRepository.findById(id).map(this::convertToEntity);
    }

    public Optional<EmployeeEntity> findByName(String name) {
        return employeeRepository.findByName(name).map(this::convertToEntity);
    }

    public Optional<EmployeeEntity> findByIdCard(String idCard) {
        return employeeRepository.findByIdCard(idCard).map(this::convertToEntity);
    }

    public void deleteById(String id) {
        employeeRepository.deleteById(id);
    }

    public EmployeeEntity update(EmployeeEntity employee) {
        EmployeeDocument doc = convertToDocument(employee);
        EmployeeDocument updatedDoc = employeeRepository.save(doc);
        return convertToEntity(updatedDoc);
    }

    private EmployeeDocument convertToDocument(EmployeeEntity entity) {
        EmployeeDocument doc = new EmployeeDocument();
        doc.setId(entity.getId());
        doc.setName(entity.getName());
        doc.setIdCard(entity.getIdCard());
        doc.setPhoto(entity.getPhoto());
        doc.setDateOfEntry(entity.getDateOfEntry());
        return doc;
    }

    private EmployeeEntity convertToEntity(EmployeeDocument document) {
        EmployeeEntity entity = new EmployeeEntity();
        entity.setId(document.getId());
        entity.setName(document.getName());
        entity.setIdCard(document.getIdCard());
        entity.setPhoto(document.getPhoto());
        entity.setDateOfEntry(document.getDateOfEntry());
        return entity;
    }
}
