package cibernacion.test.domain.employee;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "employees")
public class EmployeeDocument {

    @Id
    private String id;
    private String name;
    private String idCard;
    private String photo;
    private LocalDate dateOfEntry;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getIdCard() { return idCard; }
    public void setIdCard(String idCard) { this.idCard = idCard; }
    public String getPhoto() { return photo; }
    public void setPhoto(String photo) { this.photo = photo; }
    public LocalDate getDateOfEntry() { return dateOfEntry; }
    public void setDateOfEntry(LocalDate dateOfEntry) { this.dateOfEntry = dateOfEntry; }
}